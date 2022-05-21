package com.revature.dao;

import com.revature.models.Transaction;

import java.util.List;

public interface ITransactionDao {
    void createTransaction(Transaction t);
    List<Transaction> getTransaction(int acNumber);
}
