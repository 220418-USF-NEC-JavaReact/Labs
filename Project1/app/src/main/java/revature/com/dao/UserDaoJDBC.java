package revature.com.dao;
// Coding by Bok-Man Victor Siu and Mohammad
import revature.com.models.ChangeInfoUser;
import revature.com.models.RegisterUsers;
import revature.com.models.Users;
import revature.com.utils.ConnectionSingleton;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBC implements IUserDao{

    private ConnectionSingleton cs = ConnectionSingleton.getConnectionSingleton();

    Connection c = cs.getConnection();

    @Override
    public void registerUser(Users user) {
        Connection c = cs.getConnection();


        String sql = "insert into users (username, password, first_name, last_name, email, role) values " +
                "('" + user.getUsername() +"','" + user.getPassword() + "','" + user.getFirstName() + "','" + user.getLastName() + "','" + user.getEmail() + "','" + user.getRole() + "')";

        try {
            Statement s = c.createStatement();
            s.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Users loginUser(String username, String password) {
        return null;
    }

    @Override
    public Users logoutUser() {
        return null;
    }

    @Override
    public boolean checkManager() {
        return false;
    }

    @Override
    public Users getUserInfo(String username) {
        Connection c = cs.getConnection();
        String sql ="SELECT * FROM users WHERE username = ?";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            Users loggedIn = null;
            while(rs.next()){
                loggedIn = new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7));
            }

            return loggedIn;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Users updateUserInfo(int userIdNum, ChangeInfoUser changeInfoUser) {
        Connection c = cs.getConnection();



        String sql = "UPDATE users SET username = ?, password = ?, first_name = ?, last_name = ?, email = ? WHERE user_id = ?";


        String sql2 = "SELECT * from users WHERE user_id = ?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, changeInfoUser.getUsername());
            ps.setString(2, changeInfoUser.getPassword());
            ps.setString(3, changeInfoUser.getFirstName());
            ps.setString(4, changeInfoUser.getLastName());
            ps.setString(5, changeInfoUser.getEmail());


            ps.setInt(6, userIdNum);
            ps.execute();

            PreparedStatement ps2 = c.prepareStatement(sql2);
            ps2.setInt(1, userIdNum);
            ResultSet rs2 = ps2.executeQuery();
            Users newUser = null;
            while(rs2.next()){
                newUser = new Users(rs2.getInt(1), rs2.getString(2), rs2.getString(3), rs2.getString(4), rs2.getString(5), rs2.getString(6),rs2.getInt(7));
            }
            return newUser;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Users> viewAllEmployees() {
        Connection c = cs.getConnection();
        String sql ="SELECT * FROM users";

        try {
            List<Users> usersList = new ArrayList<>();
            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();


            while(rs.next()){
                Users user = new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7));
                usersList.add(user);
            }

            return usersList;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
