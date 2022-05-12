package com.revature.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Transaction;
import com.revature.services.TransactionService;
import io.javalin.http.Handler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TransactionController {
    private TransactionService ts;
    private ObjectMapper om;
    public TransactionController(TransactionService ts){
        this.ts = ts;
        this.om = new ObjectMapper();
    }

    public Handler handleDeposit = (ctx) -> {
        if(ctx.req.getSession().getAttribute("userId") == null){
            ctx.result("User must login to do transaction");
        } else {
            Transaction transaction = om.readValue(ctx.body(),Transaction.class);
            transaction.setDescription("deposit");
            int userId = Integer.parseInt((String)ctx.req.getSession().getAttribute("userId"));
            int status = ts.deposit(transaction, userId);
            if(status == 1){
                ctx.result("User has no account");
            } else if (status == 2){
                ctx.result("Inactive account. Ask your manager to activate account");
            } else if (status == 3){
                ctx.result("Deposit amount can not be negative");
            } else {
                ctx.result("Amount deposited");
            }
        }
    };
    public Handler handleWithdraw = ctx -> {
        if(ctx.req.getSession().getAttribute("userId") == null){
            ctx.result("User must login to do transaction");
        } else {
            Transaction transaction = om.readValue(ctx.body(),Transaction.class);
            transaction.setDescription("withdraw");
            int userId = Integer.parseInt((String)ctx.req.getSession().getAttribute("userId"));
            int status = ts.withDraw(transaction, userId);
            if(status == 1){
                ctx.result("User has no account");
            } else if (status == 2){
                ctx.result("Inactive/Deactivated account. Ask your manager to activate account");
            } else if (status == 3){
                ctx.result("Insufficient balance");
            } else {
                ctx.result("Amount withdrawn");
            }
        }
    };
    public Handler handleTransfer = ctx -> {
        if(ctx.req.getSession().getAttribute("userId") == null){
            ctx.result("User must login to do transaction");
        } else {
            int userId = Integer.parseInt((String) ctx.req.getSession().getAttribute("userId"));
            Map<String, Object> map = om.readValue(ctx.body(), Map.class);
            int acc1 = (int) map.get("acNumber1");
            int acc2 = (int) map.get("acNumber2");
            double amount = (double) map.get("amount");
            int status = ts.transfer(userId, acc1, acc2, amount);
            if (status == 4) {
                ctx.result("Transfer successful");
            } else if (status == 0) {
                ctx.result("Can not transfer from others account");
            } else {
                ctx.result("Something went wrong");
            }
        }
    };
    public Handler handleTransactionList = ctx -> {
        Map<String,Integer> map = om.readValue(ctx.body(),Map.class);
        int acNumber = map.get("acNumber");
        List<Transaction> transList = ts.getTransaction(acNumber);
        String tList = om.writeValueAsString(transList);
        if(transList != null){
            ctx.result(tList);
        } else {
            ctx.result("There is no transaction");
        }
    };
}
