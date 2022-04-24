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
        cartCost+=cost;
        String[] newCart = new String[cart.length+1];
        for(int i=0;i<cart.length;i++){
            newCart[i] = cart[i];
        }
        newCart[cart.length] = item;
        cart = newCart;
    }

    public abstract void buy();
}
