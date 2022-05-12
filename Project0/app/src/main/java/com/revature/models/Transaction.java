package com.revature.models;

import java.util.Date;

public class Transaction {
    private int id;
    private int acNumber;
    private double amount;
    private String description;
    private Account account;

    public Transaction(){

    }
    public Transaction(int id, double amount, String description, int acNumber){
        this.id = id;
        this.amount = amount;
        this.description = description;
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
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", acNumber=" + acNumber +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", account=" + account +
                '}';
    }
}
