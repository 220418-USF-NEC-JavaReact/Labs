package revature.com.dao;
import revature.com.models.GroceryItems;
import revature.com.utils.ConnectionSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroceryItemsDaoJDBC implements IGroceryItemsDao{

    public ConnectionSingleton cs = ConnectionSingleton.getConnectionSingleton();
    Connection c = cs.getConnection();

    @Override
    public void createItem(String name, double price) {
        Connection c = cs.getConnection();

        String sql = "insert into grocery (item_name, price) values (?, ?)";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.execute();
        } catch ( SQLException e){
            throw new RuntimeException(e);

        }
    }



    @Override
    public void deleteItem(String name, double price) {
        Connection c = cs.getConnection();
        String sql = "DELETE FROM grocery WHERE item_name = ? and price=?";
        try {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.execute();


        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<GroceryItems> showAll() {
        Connection c = cs.getConnection();
        List<GroceryItems> groceryItemsList = new ArrayList<>();
        String sql = "select * from grocery";
        try {
            PreparedStatement ps = c.prepareStatement(sql);

            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()){
                GroceryItems groceryItem = new GroceryItems(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                groceryItemsList.add(groceryItem);
            }
            return groceryItemsList;
        } catch ( SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updatePrice(String name, double price) {
        Connection c = cs.getConnection();
        String sql = "UPDATE grocery SET price = ? WHERE item_name = ?";
        try {

            c.setAutoCommit(false);

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setDouble(1, price);
            ps.setString(2, name);
            ps.execute();
            c.setAutoCommit(true);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
