package revature.com.services;

import revature.com.dao.IUserDao;
import revature.com.models.RegisterUsers;
import revature.com.models.Users;

import java.util.List;


public class UserService {

    private IUserDao ud;

    public UserService(IUserDao ud){
        this.ud = ud;
    }
    public void registerUser(RegisterUsers regUser){
        Users user = new Users(0,regUser.getUsername(), regUser.getPassword(), regUser.getFirstName(),regUser.getLastName(), regUser.getEmail(), regUser.getRole());
        ud.registerUser(user);
    }

    // Method to login in
    public Users loginUser(String username, String password){

        Users user = null;
        if(user!=null){
            // Write the method to return password
            if(password.equals(user.getPassword())){

                return user;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    // Method to logout
    public Users logoutUser(){
        return null;
    }

    // Method to check the role in order to display home page
    // And the permission of users
    public boolean checkManager(){
        return ud.checkRole();
    }

    // View my account information
    public Users getUserInfo(String username){
        return ud.getUserInfo(username);
    }
    // Method to update account information
    public Users updateUserInfo(RegisterUsers user){
        return ud.updateUserInfo(user);
    }

    //Manage role service class

    // Method to view all employees
    public List<Users> viewAllEmployees(){
        return ud.viewAllEmployees();
    }


}
