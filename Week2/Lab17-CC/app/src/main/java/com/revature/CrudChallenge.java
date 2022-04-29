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

        List<Person> personsList = new ArrayList<>();
        Person first = new Person("Robert", 31, "robpduo@gmail.com", 1234885l, null);
        personsList.add(first);

        Javalin server = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
        });

        server.get("/READ", ctx -> {
            //Read all the people objects being stored in the personsList
            for (Person personInfo : personsList) {
                ctx.result(personInfo.toString());
            }
        });

        server.post("/UPDATE", ctx -> {
            ObjectMapper mapper = new ObjectMapper();
            Person p = mapper.readValue(ctx.body(), Person.class);

            //Updates/inserts new entries into the List of People
            
        });

        server.start(8080);
    }

}