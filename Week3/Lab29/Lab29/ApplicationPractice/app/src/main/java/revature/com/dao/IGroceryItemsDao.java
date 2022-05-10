package revature.com.dao;

import revature.com.models.GroceryItems;

import java.util.List;

public interface IGroceryItemsDao {
    public void createItem(String name, double price);

    public void deleteItem(String name, double price);
    public List<GroceryItems> showAll();

    public void updatePrice(String name, double price);
}
