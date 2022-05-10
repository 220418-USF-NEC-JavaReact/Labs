package revature.com.services;

import revature.com.dao.GroceryItemsDaoJDBC;
import revature.com.dao.IGroceryItemsDao;
import revature.com.models.GroceryItems;

import java.util.List;

public class GroceryItemsServices {
    private IGroceryItemsDao gd;
    public GroceryItemsServices(IGroceryItemsDao gd){
        this.gd = gd;
    }
    public void createItems(String name, double price){
        gd.createItem(name, price);
    }

    public List<GroceryItems> showAllItem(){
        return gd.showAll();
    }
    public void deleteItem(String name, double price){
        gd.deleteItem(name, price);
    }

    public void updateItemPrice(String name, double price){
        gd.updatePrice(name, price);
    }
}
