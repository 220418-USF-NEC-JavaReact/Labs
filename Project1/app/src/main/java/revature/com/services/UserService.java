package revature.com.services;
// Coding by Bok-Man Victor Siu
import revature.com.dao.IUserDao;
import revature.com.models.ChangeInfoUser;
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
        Users user = ud.getUserInfo(username);

        if(user!=null){
            // Write the method to check password
            if(password.equals(user.getPassword())){
                return user;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    // View my account information
    public Users getUserInfo(String username){
        return ud.getUserInfo(username);
    }
    // Method to update account information
    public Users updateUserInfo(int userIdNum, ChangeInfoUser changeInfoUser){
        return ud.updateUserInfo(userIdNum, changeInfoUser);
    }

    //Manage role service class

    // Method to view all employees
    public List<Users> viewAllEmployees(){
        return ud.viewAllEmployees();
    }


}
