public abstract class Customers {
    // properties
    String name;
    double balance;
    String[] cart;
    double cartCost;

    // all-rgs constructor
    public Customers(String name, double balance, String[] cart, double cartCost){
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }

    // public concrete method addTocart
    public void addToCart(String item, double cost){
        // update the cartCost with the added cost
        this.cartCost += cost;
        // make the cart array one index larger, and add the item to the cart
            // make a new temporary array
            // copy the items from the old cart into the temp cart
            // add the new item to the end of the temp array
            // set the cart to the temp cart
        String[] tempCart = new String[cart.length + 1];
        tempCart = cart;
        tempCart[tempCart.length - 1] = item;
    }

    // public abstract method - buy
    public abstract void buy();
}
