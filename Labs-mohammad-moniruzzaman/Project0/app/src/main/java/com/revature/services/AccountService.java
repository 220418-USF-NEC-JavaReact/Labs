package com.revature.services;

import com.revature.dao.IAccountDao;
import com.revature.models.Account;

import java.util.List;

public class AccountService {

    private IAccountDao accountDao;

    public AccountService(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public boolean createAccount(String acType, int userId){
        int acNumber = (int)(Math.random()*(9999999-1000000+1)+1000000);
        String acStatus = "inactive";
        double balance = 0.0d;

        Account account = accountDao.getAccountById(userId);
        if(account == null){
            Account ac = new Account(acNumber, acType, acStatus, balance, userId);
            accountDao.createAccount(ac);
            return true;
        }
        else if(!account.getAcType().equals(acType)){
            Account ac = new Account(acNumber, acType, acStatus, balance, userId);
            accountDao.createAccount(ac);
            return true;
        } else {
            return false;
        }
        }

    public Account getAccountByAccountNo(int acNumber){
        return new Account();
    }
    public Account getAccountById(int id){
        return accountDao.getAccountById(id);
    }
    public List<Account> getAllAccounts(){
        return accountDao.getAllAccount();
    }
    public int UpdateAccountStatus(Account account){
        return accountDao.updateAccountStatus(account);
    }

    public void UpdateAccountBalance(int acNumber, double balance){
        accountDao.updateAccountBalance(acNumber, balance);
    }

}
