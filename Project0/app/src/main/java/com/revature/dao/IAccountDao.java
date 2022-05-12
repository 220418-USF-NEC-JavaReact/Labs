package com.revature.dao;

import com.revature.models.Account;

import java.util.List;

public interface IAccountDao {
    void createAccount(Account account);
    List<Account> getAllAccount();
    Account getAccountById(int id);
    Account getAccountByAccountNumber(int acNumber);
    int updateAccountStatus(Account account);
    int updateAccountBalance(int acNumber, double balance);
}
