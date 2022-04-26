public class PremiumCustomer extends Customers implements Premium{

    private int vipCard;
    private int years;

    public PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vipCard, int years){
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }

    public double discountPrice(double startingPrice){
        double endPrice = startingPrice * 0.85;
        return endPrice;
    }

    public void buy(){
        //Implement the buy method to remove the items from the cart, and subtract the cartCost from the Customers balance, reset the cart cost to 0.0
        setCart(new String[0]);
        setBalance(getBalance()- discountPrice(getCartCost()));
        setCartCost(0.0);
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
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Balance: ").append(getBalance()).append("\n");
        sb.append("Cart: ");
        for(String s : getCart()){
            sb.append(s + ", ");
        }
        sb.append("\n");
        sb.append("CartCost: ").append(getCartCost()).append("\n");
        sb.append("Title: ").append(this.title).append("\n");
        sb.append("VipCard: ").append(this.vipCard).append("\n");
        sb.append("Years: ").append(this.years).append("\n");
  
        return sb.toString();
    }
}
/* Test for Override
    public static void main(String args[]){
        String[] starterCart = {"Hat"};
        PremiumCustomer steve = new PremiumCustomer("Steve",0,starterCart,25,0,0);
        steve.setName("Steve");
        steve.setBalance(200);
        steve.addToCart("Shoes", 50);
        steve.addToCart("Pants", 75);
        steve.setVipCard(1234);
        steve.setYears(10);
        //steve.buy();
        System.out.print(steve.toString());
    }
}
*/