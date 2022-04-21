

public class PremiumCustomer extends Customers implements Premium{
    private int vipCard;
    private int years;

    public PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vip, int years){
        super(name, balance, cart, cartCost);
        this.vipCard = vip;
        this.years = years;
    } 
    @Override
    public void buy(){
        cart = new String[0];
        balance -= this.discountPrice(this.cartCost);
        cartCost = 0.0d;
    }
    @Override
    public double discountPrice(double startingPrice){
        double discount = (startingPrice / 100.0d) * 15.0d;
        return startingPrice - discount;
    }
    public void setName(String a){
        this.name = a;
    }
    public String getName(){
        return this.name;
    }
    public void setBalance(double a){
        this.balance = a;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCart(String[] a){
        this.cart = a;
    }
    public String[] getCart(){
        return this.cart;
    }
    public void setCartCost(double a){
        this.cartCost = a;
    }
    public double getCartCost(){
        return this.cartCost;
    }
    public void setVipCard(int a){
        this.vipCard = a;
    }
    public int getVipCard(){
        return this.vipCard;
    }
    public void setYears(int a){
        this.years = a;
    }
    public int getYears(){
        return this.years;
    }
    public String getString(String[] a){
        String b = "";
        for(String c : a){
            b = b.concat(c);
        }
        return b;
    }
    
    @Override
    public String toString(){

        return  this.getName() + " " + this.getBalance() + " " + this.getString(this.getCart()) + " " + this.getCartCost() + " " + this.getVipCard() + " " + this.getYears() + " " + this.getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
}
