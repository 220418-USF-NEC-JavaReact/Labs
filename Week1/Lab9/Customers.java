public abstract class Customers{


    private String name;
    private double balance;
    private String[] cart;
    private double cartCost;

    public Customers(String name, double balance, String[] cart, double cartCost){
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }   

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setCart(String[] cart){
        this.cart = cart;
    }

    public String[] getCart(){
        return cart;
    }

    public void setCartCost(double cartCost){
        this.cartCost = cartCost;
    }

    public double getCartCost(){
        return cartCost;
    }
    public void addToCart(String item, double cost){
        cartCost += cost;
        String[] newCart = new String[cart.length + 1];
        for (int i = 0; i < cart.length - 1; i++){
            newCart[i] = cart[i];
        }
        newCart[cart.length] = item;
        this.cart = newCart;
    }
    public abstract void buy();
}