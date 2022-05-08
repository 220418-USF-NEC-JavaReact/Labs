package com.revature.dao;

import com.revature.model.GroceryItem;

import java.util.List;

public interface IListDao {

    int createItem(String content);

    String readItem(int Id);

    void updateItem(int id, String newContent);

    void deleteItem(int id);

    List<GroceryItem> readAllListItems();
}
