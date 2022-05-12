package com.revature.dao;

import com.revature.models.User;

public interface IUserDao {
    void createUser(User user);
    User getUserByUserName(String userName);

}
