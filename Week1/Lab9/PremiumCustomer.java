import java.util.Arrays;

public class PremiumCustomer extends Customers implements IPremium{
    // private properties
    private int vipCard; // card reader
    private int years; // number of yrs as premioum customer

    // all-args constructor
    public PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vipCard, int years){
        super(name, balance, cart, cartCost); // all-args constructor of the Customer abstract class
        this.vipCard = vipCard;
        this.years = years;
    }

    // Implement the discountPrice method
    public double discountPrice(double price){
        // premium user gets a discount of 15% on all items in their cart
        // discounted price gets returned
        double discountedPrice = price + 0.15 * price;
        return discountedPrice;
    }
    // Implement the buy method
    public void buy(){
        // remove the items from the cart
        // subtract the cartCost from the Customers balance
        // reset the cart cost to 0.0
        cart = null;
        //balance -= cartCost;
        balance -= discountPrice(cartCost);
        cartCost = 0.0;

        // Use the discountPrice method to do customersBalance - discountedCartPrice
        // To empty the cart, create a new array and
        // make the cart reference that new array with 0 size for the addToCart to work
    }

    // Implement all of the getters for name, balance, cart, cartCost, vipCard, years
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public String[] getCart() {
        return cart;
    }
    public double getCartCost() {
        return cartCost;
    }
    public int getVipCard() {
        return vipCard;
    }public int getYears() {
        return years;
    }
    
    // Implement all of the setters for name, balance, cart, cartCost, vipCard, years
    public void getName(String name) {
        this.name = name;
    }
    public void getBalance(double balance) {
        this.balance = balance;
    }
    public void getCart(String[] cart) {
        this.cart = cart;
    }
    public void getCartCost(double cartCost) {
        this.cartCost = cartCost;
    }
    public void getVipCard(int vipCard) {
        this.vipCard = vipCard;
    }public void getYears(int years) {
        this.years = years;
    }

    // Override toString() from Object class to include name, balance, cart, cartCost, title, vipCard, years
    // from the abstract class, interface, and concrete class
    // get creative for cart
    @Override
    public String toString() {
        return "Name: " + name + "\n" 
                + "Balance: " + balance + "\n"
                + "Cart Items: " + Arrays.toString(cart) + "\n"
                + "Cart cost: " + cartCost + "\n"
                + "Premium Title: " + IPremium.title + "\n"
                + "Cip Card: " + vipCard + "\n"
                + "Years: " + years + "\n";
    }
}
