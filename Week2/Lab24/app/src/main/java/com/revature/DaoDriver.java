/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.revature;

import com.revature.utils.ConnectionUtil;
import com.revature.utils.DBUtils;

import java.sql.Connection;

public class DaoDriver {

    public static void main(String[] args) {

        Connection con = ConnectionUtil.getConnectionUtil().getConnection();

        //Run the following code at least once, after the initial DB setup you no longer need to run it,
        //Or you could run it each time to start out with a fresh slate each time
        DBUtils.setupDB(con);



    }
}
