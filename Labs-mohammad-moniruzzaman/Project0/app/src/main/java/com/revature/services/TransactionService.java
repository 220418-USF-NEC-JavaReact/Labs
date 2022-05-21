package com.revature.services;

import com.revature.dao.IAccountDao;
import com.revature.dao.ITransactionDao;
import com.revature.models.Account;
import com.revature.models.Transaction;

import java.util.List;

public class TransactionService {
    private ITransactionDao transactionDao;
    private IAccountDao accountDao;
    public TransactionService(ITransactionDao transactionDao, IAccountDao accountDao){
        this.transactionDao = transactionDao;
        this.accountDao =accountDao;
    }

    public int deposit(Transaction t, int userId){
        Account account = accountDao.getAccountById(userId);
        if(account == null){
            return 1;
        }
        if(!account.getAcStatus().equals("active")){
            return 2;
        }
        if(t.getAmount() < 0){
            return 3;
        }
        double balance = account.getBalance() + t.getAmount();
        accountDao.updateAccountBalance(account.getAcNumber(), balance);
        transactionDao.createTransaction(t);
        return 4;
    }
    public int withDraw(Transaction t, int userId){
        Account account = accountDao.getAccountById(userId);
        if(account == null){
            return 1;
        }
        if(!account.getAcStatus().equals("active")){
            return 2;
        }
        if(account.getBalance() < t.getAmount()){
            return 3;
        }
        double balance = account.getBalance() - t.getAmount();
        accountDao.updateAccountBalance(account.getAcNumber(), balance);
        transactionDao.createTransaction(t);
        return 4;
    }
    public int transfer(int userId, int acc1, int acc2, double amount){
        String desc1 = "transfer - deducted";
        Account account1 = accountDao.getAccountByAccountNumber(acc1);
        if(account1.getUserId() != userId){
            return 0;
        }
        Transaction t1 = new Transaction(0,amount,desc1,acc1);
        int i = withDraw(t1,account1.getUserId());
        if(i != 4){
            return i;
        }
        String desc2 = "transfer - deposited";
        Transaction t2 = new Transaction(0,amount,desc2,acc2);
        Account account2 = accountDao.getAccountByAccountNumber(acc2);
        int j = deposit(t2, account2.getUserId());
        if(j != 4){
            return j;
        }
        return 4;
    }
    public List<Transaction> getTransaction(int acNumber){
        return transactionDao.getTransaction(acNumber);
    }
}
