package com.revature.dao;

import com.revature.exceptions.DuplicateUsernameException;
import com.revature.models.User;

import java.util.List;
import java.util.zip.DataFormatException;

public interface IUserDao {
    User getUser(String username);
    List<User> getAllUsers();
    void createUser(User user) throws DuplicateUsernameException;
    void updateUser(User user);
}
