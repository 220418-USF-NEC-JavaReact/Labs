public class PremiumCustomer extends Customers implements Premium {
    private int vipCard;
    private int years;

    public PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vipCard, int years){
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }

    public void setVipCard(int vipCard){
        this.vipCard = vipCard;
    }

    public int getVipCard(){
        return vipCard;
    }

    public void setYears(int years){
        this.years = years;
    }

    public int getYears(){
        return years;
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

    @Override
    public double discountPrice(double price){
        return (price - (price * 0.15));
    }

    @Override
    public void buy(){
        balance -= discountPrice(cartCost);
        setBalance(balance);
        cartCost = 0.0;
        setCartCost(cartCost);
        cart = new String[0];
        setCart(cart);
    }
    
    public String toString() {

        return "{\nName: \nBalance: \nCart: "
                + "\nCart Cost: \nTitle: \nVip Card: "
                + "\nYears: ";
    }

}
