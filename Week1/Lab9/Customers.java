public abstract class Customers {

    public String name;
    public double balnce;
    public String[] cart;
    public double cartCost;

    public Customers(String name, double balnce, String[]cart, double cartCost){
        this.name = name;
        this.balance =balance;
        this.cart = cart;
        this.cartCaost =cartCost;
    }

    public void addToCart(String item, double cost){
        cartCost += cost;
        String [] tempArray = new String[cart.length + 1];

        for(init i = 0; i < cart.length; i++) {
            tempArray[i] = cart[i];
        }

        tempArray[cart.length] = item;
        cart = tempArray;
    }

     public abstract void buy();

    
}
