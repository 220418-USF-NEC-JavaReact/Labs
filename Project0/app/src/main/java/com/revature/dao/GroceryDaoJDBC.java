package com.revature.dao;

import com.revature.models.GroceryItem;
import com.revature.utils.ConnectionSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GroceryDaoJDBC implements IGroceryDao{
    private Connection con = ConnectionSingleton.getConnectionSingleton().getConnection();
    @Override
    public List<GroceryItem> getItems() {
        String sql = "select * from groceries";
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            List<GroceryItem> items = new ArrayList<>();
            while (rs.next()){
                GroceryItem gItem = new GroceryItem(rs.getInt(1),rs.getString(2));
                items.add(gItem);
            }
            return items;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GroceryItem getItem(String item) {
        String sql = "select * from groceries where item = " + item;
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            GroceryItem gItem = null;
            while (rs.next()){
                gItem = new GroceryItem(rs.getInt(1),rs.getString(2));
            }
            return gItem;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean addItem(String item) {
        String sql = "insert into groceries (item) values (?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,item);
            boolean success = ps.execute();
            return success;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void updateItem(GroceryItem groceryItem) {

    }

    @Override
    public void deleteItem(GroceryItem groceryItem) {

    }
}
