package com.revature.services;

import com.revature.dao.IUserDao;
import com.revature.exceptions.DuplicateUsernameException;
import com.revature.exceptions.PasswordIncorrectException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.exceptions.UsernameOrPasswordIncorrectException;
import com.revature.models.User;

import java.util.List;

public class UserService {
    private IUserDao userDao;
    public UserService(IUserDao userDao){
        this.userDao = userDao;
    }
    public void registerUser(User user) throws DuplicateUsernameException{
        try{
            userDao.createUser(user);
        } catch (DuplicateUsernameException e){
            throw e;
        }
    }
    public User loginUser(User user) throws UsernameOrPasswordIncorrectException {
        User u = userDao.getUser(user.getUsername());
        if(u == null){
            throw new UserNotFoundException();
        }
        if(!u.getPassword().equals(user.getPassword())){
            throw new PasswordIncorrectException();
        }
        return u;
    }
    public User getAccountInfo(String username){
        return userDao.getUser(username);
    }
    public List<User> getAllAccountInfo(){
        return userDao.getAllUsers();
    }
    public void updateUserInfo(User user){
        userDao.updateUser(user);
    }
}
