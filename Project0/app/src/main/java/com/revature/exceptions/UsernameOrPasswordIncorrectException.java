package com.revature.exceptions;

public class UsernameOrPasswordIncorrectException extends Exception{
    public UsernameOrPasswordIncorrectException(){
        super("Username or password Incorrect");
    }
    public UsernameOrPasswordIncorrectException(String msg){
        super(msg);
    }
}
