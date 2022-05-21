package com.revature.services;

import com.revature.dao.GroceryDaoJDBC;
import com.revature.dao.IGroceryDao;
import com.revature.models.GroceryItem;

import java.util.List;

public class GroceryService {

    private IGroceryDao gDao;

    public GroceryService(IGroceryDao gDao){
        this.gDao =gDao;
    }
    public List<GroceryItem> getGroceryItems(){
        return gDao.getItems();
    }
    public List<GroceryItem> addGroceryItem(String item){
        gDao.addItem(item);
         return gDao.getItems();
    }
}
