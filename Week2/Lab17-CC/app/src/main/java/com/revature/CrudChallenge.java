package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Person;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;

public class CrudChallenge {

    /*
        Inside of the main method: 
        Create your Javalin app
        Write 4 routes to handle CRUD functionality for the provided Person object
        Write the handlers to handle the functionality
        
    */
    public static void main(String args[]) {

        List<Person> personsList = new ArrayList<>();
        //Initializing Javalin app
        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins);


        //Setting up handlers
        app.get("/read", (ctx) -> {
            for (Person person : personsList) {
                ctx.result(String.valueOf(person));
            }

        });

        app.post("/create", (ctx) -> {
            ObjectMapper mapper = new ObjectMapper();
            Person p = mapper.readValue(ctx.body(), Person.class);
            personsList.add(p);
            System.out.println(p);
            ctx.result(mapper.writeValueAsString(p));
        });

        app.post("/update/{id}", (ctx) -> {
            int id = Integer.parseInt(ctx.pathParam("id"));
            ObjectMapper mapper = new ObjectMapper();
            Person p = mapper.readValue(ctx.body(), Person.class);
            personsList.add(id, p);
            System.out.println(p);
            ctx.result(mapper.writeValueAsString(p));
        });

        app.post("/delete/{id}", (ctx) -> {
            int id = Integer.parseInt(ctx.pathParam("id"));
            System.out.println(id);
            //personsList.remove(id);
            ctx.result(String.valueOf(personsList.get(id)));
        });

        //Transmit on port 8080
        app.start(8080);
    }

}