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

    public static void addToCart(String item, double cost){

        String[] temp;
        cartCost = cartCost + cost;

        for(int i = 0; i < cart.length, i++){
            temp[i] = cart[i];
            
        }

        temp[cart.length] = item;

        cart = temp;


    }

    public abstract void buy();

}