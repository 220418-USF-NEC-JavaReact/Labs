public class PremiumCustomer extends Customers implements Premium{
    private int vipCard;
    private int years;

    public PremiumCustomer(String name, double balance, String[] cart, 
    double cartCost, int vipCard, int years) {
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }

    @Override
    public double discountPrice(double sPrice) {
        double newPrice;

        newPrice = sPrice - (sPrice * 0.15);

        return newPrice;
    }

    @Override
    public void buy() {
        String[] newCart = new String[0];
        setCart(newCart);

        double currentCost = getCartCost();
        double newBalance = getBalance() - discountPrice(currentCost);
        setBalance(newBalance);
        setCartCost(0.0);
    }

    public void setName(String name) {
        this.name = name;
    }

   public void setBalance(double balance) {
       this.balance = balance;
    }

    public void setCart(String[] cart) {
        this.cart = cart;
    }

    public void setCartCost(double cartCost) {
        this.cartCost = cartCost;
    }

    public void setVipCard(int vipCard) {
        this.vipCard = vipCard;
    }

    public void setYears(int years) {
        this.years = years;
    }

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

    public int getVipCards() {
        return vipCard;
    }

    public int getYears() {
        return years;
    }

    public String toString() {
        return "Name: \nBalance: \nCart: \nCart Cost: \nTitle: \n" +
        "Vip Card: \nYears: ";
    }
}