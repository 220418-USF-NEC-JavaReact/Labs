package revature.com.dao;

import revature.com.models.RegisterUsers;
import revature.com.models.Users;
import revature.com.utils.ConnectionSingleton;

import java.sql.*;
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
    public boolean checkRole() {
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
    public Users updateUserInfo(RegisterUsers user) {
        return null;
    }

    @Override
    public List<Users> viewAllEmployees() {
        return null;
    }
}
