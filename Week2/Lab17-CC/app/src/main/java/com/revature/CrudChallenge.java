package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Address;
import com.revature.models.Person;
import io.javalin.Javalin;

public class CrudChallenge{

    /*
        Inside of the main method: 
        Create your Javalin app
        Write 4 routes to handle CRUD functionality for the provided Person object
        Write the handlers to handle the functionality
        
    */
    public static void main(String args[]){
        IUserDao ud = new UserDaoJDBC();
        UserService us = new UserS

        List<Person> personsList = new ArrayList<>();

        Javalin server = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
        });


        server.start(8080);
    }

}