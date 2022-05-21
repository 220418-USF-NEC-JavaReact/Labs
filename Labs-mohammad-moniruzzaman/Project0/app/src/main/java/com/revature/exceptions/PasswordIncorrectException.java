package com.revature.exceptions;

public class PasswordIncorrectException extends UsernameOrPasswordIncorrectException{
    public PasswordIncorrectException(String msg){
        super(msg);
    }
}
