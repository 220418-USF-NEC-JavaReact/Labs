package com.revature.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {

    public static void setupDB(Connection c){

        try {
            Statement s = c.createStatement();
            String drop = "DROP ALL OBJECTS";
            s.executeUpdate(drop);

            InputStream is = DBUtils.class.getClassLoader().getResourceAsStream("setup.sql");
            List<String> commands = setupDBStatements(is);

            for(String command: commands){
                try {
                    s = c.createStatement();
                    s.executeUpdate(command);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void runStatements(List<String> statements, Connection c){

        Statement s = null;
        for(String command: statements){
            try {
                s = c.createStatement();
                s.executeUpdate(command);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> setupDBStatements(InputStream is){

        List<String> commands = new ArrayList<>();
        StringBuilder text = new StringBuilder();

        int i = 0;
        try{
            while((i=is.read()) != -1){
                if((char) i == ';'){
                    String command = text.toString();
                    commands.add(command);
                    text = new StringBuilder();
                }
                else{
                    text.append((char)i);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }


        return commands;

    }

}
