package com.revature.exceptions;

public class UsernameIncorrectException extends UsernameOrPasswordIncorrectException{
    public UsernameIncorrectException(String msg){
        super(msg);
    }

}
