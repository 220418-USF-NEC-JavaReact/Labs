public abstract class Customers {

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

    public void addToCart(String item, double cost) {
        cartCost += cost;
        String[] tempArr = new String[cart.length+1];
        for(int i = 0; i < cart.length; i++) {
            tempArr[i] = cart[i];
        }
        tempArr[cart.length] = item;
        this.cart = tempArr;
    }

    public abstract void buy();

}