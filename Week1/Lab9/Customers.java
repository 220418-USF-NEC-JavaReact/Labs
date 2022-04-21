public abstract class Customers{

    public String name;//the name of your customer
    public double balance;//the balance your customer has to spend
    public String[] cart; //a list of items your customer is looking to buy
    public double cartCost;//the cost of the items in your cart

    public Customers(String name,double balance, String[] cart, double cartCost){

        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }

    public void addToCart(String item, double cost){

        cartCost += cost;
        String[] tempCart = new String[cart.length+1];
        
        for(int index=0;index < cart.length; index++){

            tempCart[index] = cart[index];            
        }

        tempCart[cart.length] = item;
        cart = tempCart;
        
    }

    public abstract void buy();

}