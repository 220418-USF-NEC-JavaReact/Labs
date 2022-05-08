package com.revature.service;

import com.revature.dao.IListDao;
import com.revature.model.GroceryItem;

import java.util.List;

public class GroceryService {

    private IListDao ild;

    public GroceryService(IListDao ild) {
        this.ild = ild;
    }

    public int createItem(String newContent){
        return ild.createItem(newContent);
    }

    public String readItem(int id){
        String content = ild.readItem(id);
        return content;
    }

    public void updateItem(int id, String newContent){
        ild.updateItem(id, newContent);
    }

    public void deleteItem(int id){
        ild.deleteItem(id);
    }

    public List<GroceryItem> readAllGroceryItems(){
        return ild.readAllListItems();
    }
}
