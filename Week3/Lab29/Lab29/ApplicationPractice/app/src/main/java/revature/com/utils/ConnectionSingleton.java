package revature.com.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Class to connect the database
public class ConnectionSingleton {
    private static ConnectionSingleton cs;
    private static Properties prop = new Properties();

    private ConnectionSingleton(){

    }

    public static synchronized ConnectionSingleton getConnectionSingleton(){
        if(cs == null){
            cs = new ConnectionSingleton();
        }
        return cs;
    }

    public Connection getConnection(){
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        String url = "";
        String username = "";
        String password ="";


        try{
            // Searching the jdbc.properties in resources file
            prop.load(is);
            url = (String)prop.getProperty("url");
            username = (String)prop.getProperty("username");
            password = (String)prop.getProperty("password");
        } catch(IOException e){

            e.printStackTrace();
        }

        Connection con;
        try{
            // Connecting database
            con = DriverManager.getConnection(url, username,password);
            return con;
        } catch (SQLException e){
            // Cases for not connecting database,
            // such as username or/and password incorrect
            // Or missing correct database
            e.printStackTrace();
        }

        return null;
    }

}
