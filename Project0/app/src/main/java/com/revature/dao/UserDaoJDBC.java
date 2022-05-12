package com.revature.dao;

import com.revature.models.User;
import com.revature.utils.ConnectionSingleton;

import java.sql.*;

public class UserDaoJDBC implements IUserDao{

    private ConnectionSingleton cs = ConnectionSingleton.getConnectionSingleton();
    @Override
    public void createUser(User user) {
        Connection con = cs.getConnection();
        String sql = "insert into users (first_name,last_name,user_type,email,username,password) values " + "('" +
                user.getFirstName() + "','" + user.getLastName() +
                "','" + user.getUserType() + "','" + user.getEmail() + "','" +
                user.getUsername() + "','" + user.getPassword() + "');";
        try {
            Statement s = con.createStatement();
            s.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public User getUserByUserName(String userName) {
        Connection con = cs.getConnection();
        String sql = "select * from users where username= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();

            User user = null;
            while(rs.next()){
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7));
            }

            return user;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
