

public abstract class Customers {
    public String name;
    public double balance;
    public String[] cart;
    public double cartCost;
    
    public Customers(String name, double balance, String[] cart, double cartCost){
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }
    public void addToCart(String item, double cost){
        cartCost += cost;
        String[] cartQueue = new String[cart.length + 1];
        for(int a = 0; a < cart.length; a++){
            cartQueue[a] = cart[a];
        }
        cartQueue[cart.length] = item;
        cart = cartQueue;
    }
    public abstract void buy();
}
