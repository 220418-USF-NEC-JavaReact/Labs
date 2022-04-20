public class PremiumCustomer extends Customers implements Premium {

    private int vipCard;
    private int years;

    public PremiumCustomer (String name, double balance, String[] cart, double cartCost, int vipCard, int years) {
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }

    public double discountPrice(double startingPrice) {
        return .85 * startingPrice;
    }

    public void buy() {
        balance -= discountPrice(cartCost);
        cart = new String[0];
        cartCost = 0;
    }

    // GETTERS
    public int getVipCard() {
        return vipCard;
    }

    public int getYears() {
        return years;
    }

    public String getName() {
        return super.name;
    }

    public double getBalance() {
        return super.balance;
    }

    public String[] getCart() {
        return super.cart;
    }

    public double getCartCost() {
        return super.cartCost;
    }

    // SETTERS
    public void setVipCard(int vipCard) {
        this.vipCard = vipCard;
    }

    public void setYears(int years) {
        this.years = years;
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

    // Overriding the toString method
    @Override
    public String toString() {
        String cartStr = "";
        for(int i = 0; i < super.cart.length; i++) {
            cartStr += cart[i] + " ";
        }
        return super.name + " " + super.balance + " " + 
                    cartStr + super.cartCost + " " + 
                    vipCard + " " + years;
    }
}