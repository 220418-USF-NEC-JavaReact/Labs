package revature.com.models;

public class GroceryItems {
    private int groceryItemId;
    private String name;
    private double price;

    public GroceryItems(){

    }
    public GroceryItems(int groceryItemId, String name, double price){
        this.groceryItemId = groceryItemId;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setGroceryItemId(int groceryItemId) {
        this.groceryItemId = groceryItemId;
    }

    public int getGroceryItemId() {
        return groceryItemId;
    }

    @Override
    public String toString() {
        return "Grocery Items:{ \n\t" +
                "Item ID:' " + groceryItemId + "\n\t" +
                "Name:' " + name  + "\n\t" +
                "Price:' " + price + "\n\t" +
                "}";

    }
}























