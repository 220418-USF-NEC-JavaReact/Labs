abstract class Customers{
    public String name;
    public double balance;
    public String[] cart;
    public double cartCost;

    Customers(String name, double balance, String[] cart, double cartCost){
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }
    public void addToCart (String item, double cost){
        this.cartCost += cost;
        String[] tempArray = new String[cart.length + 1];
        for (int i=0; i < this.cart.length; i++){
            tempArray[i] = cart[i];
        }
        tempArray[cart.length] = item;
        cart = tempArray;
    }
    public abstract void buy();
}