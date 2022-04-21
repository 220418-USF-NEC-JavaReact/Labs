public abstract class Customers {
    private String name;    //customer name
    private double balance; //spending balance
    private String[] cart;  //list of items
    private double cartCost;   //cost of items in cart

    //all-args constructor
    public Customers (String name, double balance, String[] cart, double cartCost) {
        this.name = name;
        this.balance = balance;
        this.cart = cart;;
        this.cartCost = cartCost;
    }

    /*takes in 2 String arrays, copy contents of the smaller string array into
    the larger string array and returns the larger string array.
    Old cart = oCart (smaller), New cart = nCart (larger) */
    private String[] growCart (String[] nCart, String[] oCart) {

        for (int i = 0; i < oCart.length; i++) {
            nCart[i] = oCart[i];
        }

        return nCart;
    }

    /*update cartCost with the added costs of an item, creates a new String array
    with the new item appended*/
    public void addToCart (String item, double cost) {

        String[] newCart = new String[cart.length + 1];
        newCart = growCart(newCart, cart);

        newCart[cart.length] = item;

        cart = new String[newCart.length];
        cart = newCart;

        cartCost += cost;
    }

    public abstract void buy ();

    /*below is a list of mutator modifiers*/
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

     public String[] getCart () {
         return cart;
     }

     public void setCart (String[] cart) {
         this.cart = new String[cart.length];
         this.cart = cart;
     }

    public double getCartCost () {
        return cartCost;
    }

    public void setCartCost (double cartCost) {
        this.cartCost = cartCost;
    }
}
