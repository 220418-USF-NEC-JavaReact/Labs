package revature.com.dao;
// Coding by Bok-Man Victor Siu and Mohammad
import revature.com.models.ChangeInfoUser;
import revature.com.models.RegisterUsers;
import revature.com.models.Users;

import java.util.List;

public interface IUserDao {

    public void registerUser(Users user);



    public Users loginUser(String username, String password);


    public Users logoutUser();


    public boolean checkManager();



    public Users getUserInfo(String username);


    public Users updateUserInfo(int userIdNum, ChangeInfoUser changeInfoUser);


    public List<Users> viewAllEmployees();
}
