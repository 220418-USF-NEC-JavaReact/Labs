package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static ConnectionUtil cu;

    private static final String USER = "lab";
    private static final String PASS = "pass";
    //private static final String DRIVER = "com.h2database.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/lab24";

    private ConnectionUtil(){

    }

    public static synchronized ConnectionUtil getConnectionUtil(){
        if(cu == null) {
            cu = new ConnectionUtil();
        }
        return cu;
    }

    public Connection getConnection(){
        Connection c = null;

        try{
            c = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }

}
