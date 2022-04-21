public class PremiumCustomer extends Customers implements Premium{

    private int vipCard;
    private int years;

    public PremiumCustomer(String name,double balance, String[] cart, double cartCost, int vipCard, int years){
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }

    public double discountPrice(double salePrice){
        return salePrice * .85;
    }

    public void buy(){
        //method to remove the items from the cart,
        this.cart = new String[0]; 
        //subtract the cartCost from the Customers balance, 
        this.balance = this.balance - discountPrice(this.cartCost);
        //reset the cart cost to 0.0
        this.cartCost = 0.0;
    }

    public String getPremiumCustomerName(){
        return name;
    }

    public void setPremiumCustomerName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String[] getCart(){
        return cart;
    }

    public void setCart(String[] cart){
        this.cart = cart;
    }

    public double getCartCost(){
        return cartCost;
    }

    public void setCartCost(double cartCost){
        this.cartCost = cartCost;
    }

    public int getVipCard(){
        return vipCard;
    }

    public void setVipCard(int vipCard){
        this.vipCard = vipCard;
    }

    public int getYears(){
        return years;
    }

    public void setYears(int years){
        this.years = years;
    }

    @Override
    public String toString() {
        return "Premium Customer: " + this.name 
        + "\nBalance: " + this.balance 
        + "\nItems in Cart: " + this.cart.toString()
        + "\nCart Cost: " + this.cartCost
        + "\n" + title + " Member"
        + "\nVIP Card Number: " + this.vipCard
        + "\nMembership Years: " + this.years;
    }




}