package com.revature.services;

import com.revature.dao.IUserDao;
import com.revature.exceptions.PasswordIncorrectException;
import com.revature.exceptions.UsernameIncorrectException;
import com.revature.exceptions.UsernameOrPasswordIncorrectException;
import com.revature.models.User;

import java.util.Date;

public class UserService {
    private IUserDao userDao;
    public UserService(IUserDao userDao){
        this.userDao = userDao;
    }
    public void registerUser(User u){
        User user = new User(u.getFirstName(), u.getLastName(), u.getUserType(), u.getEmail(), u.getUsername(), u.getPassword());
        userDao.createUser(user);
    }
    public User loginUser(String userName, String password) throws UsernameOrPasswordIncorrectException {

        User user = userDao.getUserByUserName(userName);
        if(user == null){
            throw new UsernameIncorrectException("User name incorrect");
        } else if( !user.getPassword().equals(password)){
            throw new PasswordIncorrectException("Password incorrect");
        }
        return user;
    }

    public User getUserByUserName(String username){
        return userDao.getUserByUserName(username);
    }

}
