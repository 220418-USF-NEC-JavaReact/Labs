public class PremiumCustomer extends Customers implements Premium {
    private int vipCard;
    private int years;

    PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vipCard, int years){
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }
    public double discountPrice(double cartCost){
        return cartCost*0.85;
    }
    public void buy(){
        for(int i = 0; i < cart.length; i++){
            this.balance -= discountPrice(cartCost);
            this.cartCost = 0;
            String[] tempArray = new String[0];
            this.cart = tempArray;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String[] getCart(){
        return this.cart;
    }
    public void setCart(String[] cart){
        this.cart = cart;
    }
    public double getCartCost(){
        return this.cartCost;
    }
    public void setCartCost(double cartCost){
        this.cartCost = cartCost;
    }
    public int getVipCard(){
        return this.vipCard;
    }
    public void setVipCard(int vipCard){
        this.vipCard = vipCard;
    }
    public int getYears(){
        return this.years;
    }
    public void setYears(int years){
        this.years = years;
    }
    @Override
    public String toString(){
        String cartConglom = "";
        for(int i=0; i < this.cart.length; i++){
            cartConglom += (this.cart[i] + " ");
        }
        String fullConglom  = ("Name: " + name + " Balance: " + balance + " "
         + cartConglom + " Cart Cost: " + cartCost + " VIP Card: " + vipCard + " Years: " + years); 
        return fullConglom;
    }
}
