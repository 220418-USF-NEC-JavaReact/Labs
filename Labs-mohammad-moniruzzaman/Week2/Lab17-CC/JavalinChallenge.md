# Open the Lab17 folder in Intellij to begin the coding challenge

The goal of this miniture coding challenge is to test your ability to use Javalin to create a simple CRUD (Create, Read, Update, Delete) API and interact with it through Postman

Make sure you are editing code in the app > src > main folder and not the bin or build folder

## Provided Code:

Provided are two model classes:

**Person** is the main model classed located in `com.revature.models.Person`, this will be the main class we want to operate on with this challenge

**Address** models a normal address associated with a Person. When making your API requests, any request with a body will have to include the entire Address object with all of its properties, or it will not work correctly

The dependencies for Javalin and Jackson are also included for your convience

## Challenge: Create a CRUD API for the Person class

Using the correct HTTP request verbs, and route naming conventions implement the following:

1. In the `com.revature.CrudChallenge` class create a Javalin app mapped to port 8080
2. Create a route to READ a list of all the people objects being stored in the personsList
3. Implement the handler to handle the logic of reading all of the people from the personsList
4. Create a route to CREATE a new Person object
5. Implement the hanlder to handle the logic of create a new Person object, and adding it to the list of people
6. Create a route to UPDATE a Person object in the list of people
7. Implement the handler to handle the logic to find the specified person, and update that record in the list of people
8. Create a route to DELETE a Person object from the list of people
9. Implement the handler to handle the logic to find the specifed person, and delete that record from the list of people

Test each of your routes with Postman, push your code to your branch as you complete each step
