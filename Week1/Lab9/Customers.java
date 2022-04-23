abstract class Customers {
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
        cartCost = cartCost + cost;
        String[] newCart = new String[cart.length];

        if (cart[0] == null) {
            cart[0] = item;
        } else {
            for(int i = 0; i<cart.length; i++){
                newCart[i] = cart[i];
            }
        }

        newCart[cart.length + 1] = item;

        for(int i = 0; i<newCart.length; i++){
                cart[i] = newCart[i];
        }
    }

    public abstract void buy();
}