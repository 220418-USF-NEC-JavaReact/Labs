package com.revature.models;

import java.util.List;

public class AccountDetail {
    private int id;
    private int acNumber;
    private String acType;
    private double balance;

    public AccountDetail(){

    }
    public AccountDetail(String acType, double balance, int acNumber){
        this.acType = acType;
        this.balance = balance;
        this.acNumber = acNumber;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(int acNumber) {
        this.acNumber = acNumber;
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

    @Override
    public String toString() {
        return "AccountDetail{" +
                "id=" + id +
                ", acNumber=" + acNumber +
                ", acType='" + acType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
