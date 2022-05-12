package com.revature.dao;

import com.revature.models.GroceryItem;

import java.util.List;

public interface IGroceryDao {
    List<GroceryItem> getItems();
    GroceryItem getItem(String item);
    boolean addItem(String item);
    void updateItem(GroceryItem groceryItem);
    void deleteItem(GroceryItem groceryItem);
}
