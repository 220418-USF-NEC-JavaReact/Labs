package com.revature.controllers;

import com.revature.exceptions.PasswordIncorrectException;
import com.revature.exceptions.UsernameIncorrectException;
import com.revature.models.User;
import com.revature.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.http.Handler;

import java.util.Map;

public class UserController {
    private UserService us;
    private ObjectMapper om;
    public UserController(UserService us){
        this.us = us;
        this.om = new ObjectMapper();
    }
    public Handler handleRegister = (ctx) -> {
        User user = om.readValue(ctx.body(), User.class);

        //us.registerUser(user.getFirstName(),user.getLastName(),user.getUserType(),user.getEmail(),user.getUsername(),user.getPassword());
        us.registerUser(user);
        ctx.status(201);
        ctx.result("User created.");
    };

    public Handler handleLogin = (ctx) -> {
        User user = om.readValue(ctx.body(), User.class);
        User loginUser = us.loginUser(user.getUsername(), user.getPassword());
        try{
            us.loginUser(user.getUsername(), user.getPassword());
            ctx.req.getSession().setAttribute("userId",Integer.toString(loginUser.getId()));
            ctx.req.getSession().setAttribute("userType", loginUser.getUserType());
            ctx.result("Login successful");
        } catch (UsernameIncorrectException e){
            throw e;
        } catch (PasswordIncorrectException e){
            throw e;
        }
    };

    public Handler handleLogout = (ctx) -> {
        if(ctx.req.getSession().getAttribute("userId") != null){
            ctx.req.getSession().invalidate();
            ctx.result("User logged out");
        } else {
            ctx.result("No user logged in");
        }

    };
    public Handler handleGetUserByUserName = ctx -> {
        Map<String,String> map = om.readValue(ctx.body(),Map.class);
        String username = map.get("username");
        User user = us.getUserByUserName(username);
        String userInfo = om.writeValueAsString(user);
        if(user != null){
            ctx.result(userInfo);
        } else {
            ctx.result("User not found");
        }
    };

}