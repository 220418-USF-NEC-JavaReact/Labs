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

        Address address1 = new Address("lineOne", "city", "state", 1, "country");
        Person person1 = new Person("Victor", 28, "example@hotmail.com", 123456789l, address1 );
        Address address2 = new Address("lineOne", "city", "state", 2, "country");
        Person person2 = new Person("Eric", 26, "example2@hotmail.com", 123456790l, address2 );


        personsList.add(person1 );
        personsList.add(person2);


        //Set up Javalin
        Javalin server = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
        });

        // Set up Javalin http handle
        // ctx as context object

        // Test for connect Postman
        server.get("/people", (ctx) -> ctx.result("Send back a message. "));

        // Read
        server.get("/read", (ctx) -> {

            // Not using for loop since it would keep resend
            // and then print the last object only
            //
            for (Person person: personsList){

            }
            // Print out the list
            ctx.json(personsList);
        });
        // Create


        server.post("/create", (ctx) -> {
            ObjectMapper mapper = new ObjectMapper();
            // Get input from body
            Person person = mapper.readValue(ctx.body(), Person.class);
            // Print out in app for testing

            System.out.println(person);


            // Print out in POSTMAN for testing
            ctx.result(mapper.writeValueAsString(person));

        });
        /*
        {
        "name": "Calvin",
        "age": 23,
        "email": "example@email.com",
        "socialsecurity": 123412341,
        "address": null
        }
         */


        //Update

        //Delete

        //Start the Javalin
        server.start(8000);
    }

}