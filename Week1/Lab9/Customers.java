package Week1.Lab9;

abstract class Customers {

    public String name;
    public double balance;
    public String[] cart;
    public double cartCost;


    public Customers(String name, double balance, String[] cart, double cartCost) {
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String[] getCart() {
        return cart;
    }

    public void setCart(String[] cart) {
        this.cart = cart;
    }

    public double getCartCost() {
        return cartCost;
    }

    public void setCartCost(double cartCost) {
        this.cartCost = cartCost;
    }

    public void addToCart(String item, double cost) {

        cartCost += cost;
        int newCartLength = cart.length + 1;
        String[] newCart = new String[newCartLength];
        for (int i = 0; i < newCartLength; i++) {
            newCart[i] = cart[i];
        }
        newCart[newCartLength] = item;

        setCart(newCart);

    }

    public abstract void buy();

}