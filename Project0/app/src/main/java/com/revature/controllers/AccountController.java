package com.revature.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Account;
import com.revature.services.AccountService;
import io.javalin.http.Handler;
import java.util.List;
import java.util.Map;


public class AccountController {
    private AccountService as;
    private ObjectMapper om;

    public AccountController(AccountService as) {
        this.as = as;
        this.om = new ObjectMapper();
    }
    public Handler handleAccountRegister = (ctx)-> {
        Map<String,String> map = om.readValue(ctx.body(),Map.class);
        String acType = map.get("acType");
        if(ctx.req.getSession().getAttribute("userId") == null){
            ctx.status(403);
            ctx.result("User must login to create an account");
        } else {
            int userId = Integer.parseInt((String)ctx.req.getSession().getAttribute("userId"));
            boolean success = as.createAccount(acType,userId);
            if(success){
                ctx.status(201);
                ctx.result("Account created.");
            } else {
                ctx.result(acType + " type account already exists. Please select another type account");
            }

        }
    };
    public Handler handleGetAllAccount = (ctx)->{
        if(ctx.req.getSession().getAttribute("userType").equals("manager")){
            List<Account> accountList = as.getAllAccounts();
            String result = om.writeValueAsString(accountList);
            ctx.status(200);
            ctx.result(result);
        } else {
            ctx.result("Only manager can see all accounts");
        }
    };
    public Handler handleGetAccountById = ctx -> {
        if(ctx.req.getSession().getAttribute("userId") != null){
            int userId = Integer.parseInt((String)ctx.req.getSession().getAttribute("userId"));
            Account account = as.getAccountById(userId);
            if(account != null) {
                String acc = om.writeValueAsString(account);
                ctx.result(acc);
            } else {
                ctx.result("Seems like you don't have an account");
            }
        } else {
            ctx.result("You are not logged in");
        }

    };
    public Handler handleAccountUpdate = (ctx)->{
        Account account = om.readValue(ctx.body(),Account.class);
        System.out.println(account);
        if(ctx.req.getSession().getAttribute("userId") == null) {
            ctx.status(403);
            ctx.result("User must login to update account");
        } else if (!ctx.req.getSession().getAttribute("userType").equals("manager")){
            ctx.status(403);
            ctx.result("Only Manager can update account");
        } else {
            int success = as.UpdateAccountStatus(account);
            if(success == 1){
                ctx.status(200);
                ctx.result("Account updated successfully");
            } else {
                ctx.status(304);
                ctx.result("Something went wrong");
            }
        }
    };
}