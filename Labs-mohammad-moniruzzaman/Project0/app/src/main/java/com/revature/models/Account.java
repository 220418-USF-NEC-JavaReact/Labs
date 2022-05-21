package com.revature.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int acNumber;
    private int userId;
    private String acStatus;
    private String acType;
    private double balance;
    private User user;
    private List<Transaction> transactionList;

    public Account(){
    }
    public Account(int acNumber, String acType, String acStatus, double balance, int userId){
        this.acNumber = acNumber;
        this.acType = acType;
        this.acStatus = acStatus;
        this.balance = balance;
        this.userId = userId;
    }
    public Account(int acNumber, String acType, String acStatus, double balance, int userId, User user){
        this.acNumber = acNumber;
        this.acType = acType;
        this.acStatus = acStatus;
        this.balance = balance;
        this.userId = userId;
        this.user = user;
    }

    public int getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(int acNumber) {
        this.acNumber = acNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAcStatus() {
        return acStatus;
    }

    public void setAcStatus(String acStatus) {
        this.acStatus = acStatus;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acNumber=" + acNumber +
                ", userId=" + userId +
                ", acStatus='" + acStatus + '\'' +
                ", acType='" + acType + '\'' +
                ", balance=" + balance +
                ", user=" + user +
                ", transactionList=" + transactionList +
                '}';
    }
}
