package revature.com.dao;

import revature.com.models.RegisterUsers;
import revature.com.models.Users;

import java.util.List;

public interface IUserDao {

    public void registerUser(Users user);



    public Users loginUser(String username, String password);


    public Users logoutUser();


    public boolean checkRole();



    public Users getUserInfo(String username);


    public Users updateUserInfo(RegisterUsers user);


    public List<Users> viewAllEmployees();
}
