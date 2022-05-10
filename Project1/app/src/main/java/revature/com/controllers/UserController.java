package revature.com.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.http.Handler;
import revature.com.models.LoginUsers;
import revature.com.models.RegisterUsers;
import revature.com.services.UserService;
import revature.com.models.Users;

public class UserController {
    
    private UserService us;
    
    private ObjectMapper om;
    
    public UserController(UserService us){
        this.us = us;
        this.om = new ObjectMapper();
    }

    public Handler handleRegisterUser = (ctx) -> {
        // Get para
        // JSON to Java
        RegisterUsers ru = om.readValue(ctx.body(), RegisterUsers.class);

        // Use to run registerUser method in UserServices class
        us.registerUser(ru);

        // Display status code and message
        ctx.status(201);
        ctx.result("User has been created. ");

    };

    public Handler handleLoginUser = (ctx) -> {

        // JSON to Java
        // Get the LoginUser object including username and password
        LoginUsers lu = om.readValue(ctx.body(), LoginUsers.class);


        // Using loginUser in UserServices class, and Dao class to connect database to check that matching
        Users u = us.loginUser(lu.getUsername(), lu.getPassword());


        // If not matching
        if(u == null){
            ctx.status(403);
            ctx.result("Username or password was incorrect");
        } else {
            // Write the method which return id

            //
            //We could also, if the user is logged in successfully, set up a session for them
            ctx.req.getSession().setAttribute("username", ""+u.getUsername());
            ctx.result(om.writeValueAsString(u.getUsername() + " has been login. "));
            // Set the attribute if the user is manager
            if (us.checkManager() == true){
                ctx.req.getSession().setAttribute("manager", ""+u.getUsername());
            }
        }
    };

    public Handler handleLogout = (ctx) -> {

        if (ctx.req.getSession().getAttribute("username") == null){

            ctx.result("No operation. You has been log out already. ");

        } else {
            //We could also, if the user is logged in successfully, set up a session for them
            // Return null from us.logoutUser()
            ctx.req.getSession().setAttribute("username", us.logoutUser());

            // clear the session attribute of manager
            if (ctx.req.getSession().getAttribute("manager") != null) {
                ctx.req.getSession().setAttribute("manager", us.logoutUser());
            }
            ctx.result(om.writeValueAsString(" You have been logout. "));
        }
    };

    // Handler to show user information
    public Handler handleShowUserByUserName = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null) {
            ctx.status(401);
            ctx.result("You must login to show information. ");
        } else{
            // Get username from session attribute
            String username = (String) ctx.req.getSession().getAttribute("username");

            ctx.status(200);
            // Run getUserInfo method in us, and display
            ctx.result(om.writeValueAsString(us.getUserInfo(username)));
        }
    };

    public Handler handleUpdateUser = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You need to be login.");
        } else {
            String username = (String) ctx.req.getSession().getAttribute("username");

            RegisterUsers changeInfoUser = om.readValue(ctx.body(), RegisterUsers.class);
            if(username != changeInfoUser.getUsername()){
                ctx.result(om.writeValueAsString("Input username is not matching current username"));
            } else {
                us.updateUserInfo(changeInfoUser);
                ctx.result(om.writeValueAsString("User information has been changed, \t\n " + us.getUserInfo(username)));
                ctx.status(200);

            }

        }
    };

    public Handler handlerShowAllByManager = (ctx) -> {
        if (ctx.req.getSession().getAttribute("username") == null){
            ctx.status(401);
            ctx.result("You must login.");
        } else if (ctx.req.getSession().getAttribute("manager") == null) {
            ctx.status(401);
            ctx.result("You must be manager.");
        } else {
            ctx.status(200);

            ctx.result(om.writeValueAsString(us.viewAllEmployees()));
        }

    };

}
