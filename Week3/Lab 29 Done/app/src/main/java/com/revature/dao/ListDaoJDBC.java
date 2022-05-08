package com.revature.dao;

import com.revature.model.GroceryItem;
import com.revature.util.ConnectionSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListDaoJDBC implements IListDao {

    public ConnectionSingleton cs = ConnectionSingleton.getConnectionSingleton();

    @Override
    public int createItem(String content) {
        Connection c = cs.getConnection();

        String sql = "insert into grocery (item) values ('?')";
        String sql2 = "select id from grocery order by id desc limit 1";

        try{
            PreparedStatement ps = c.prepareStatement(sql);
            PreparedStatement ps2 = c.prepareStatement(sql2);
            ps.setString(1, content);
            ps.executeQuery();
            ResultSet rs = ps2.executeQuery();
            int id = rs.getInt(1);
            return id;
        }catch(SQLException e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public String readItem(int Id) {
        Connection c = cs.getConnection();
        String sql ="SELECT * FROM grocery WHERE id = ?";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();

            GroceryItem selected = null;
            while(rs.next()){
                selected = new GroceryItem(rs.getInt(1), rs.getString(2));
            }

            return selected.getElementText();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateItem(int id, String newContent) {
        Connection c = cs.getConnection();
        String sql = "UPDATE grocery " +
                "SET item = ? WHERE id = ?"; //index 1

        try{
            PreparedStatement p = c.prepareStatement(sql);

            p.setInt(2, id);
            p.setString(1, newContent);

            p.execute();

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteItem(int id) {
        Connection c = cs.getConnection();
        String sql = "DELETE FROM grocery WHERE id = ?";

        try{
            PreparedStatement p = c.prepareStatement(sql);


            p.setInt(1, id);

            p.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<GroceryItem> readAllListItems() {
        Connection c = cs.getConnection();
        String sql2 = "SELECT * FROM grocery";
        try{
            PreparedStatement ps2 = c.prepareStatement(sql2);
            ResultSet rs = ps2.executeQuery();
            ArrayList<GroceryItem> al = new ArrayList<>();
            while(rs.next()){
                GroceryItem temp = new GroceryItem(rs.getInt(1), rs.getString(2));
                al.add(temp);
            }
            return al;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
