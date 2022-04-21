public class PremiumCustomer extends Customers implements Premium {
    private int vipCard;    //premium member card number
    private int years;      //years listed as a premium customer

    public PremiumCustomer (String preName, double preBalance, String[] preCart, double preCartCost, int vipCard, int years) {
        /*if we call the all-args constructor, then we need to also 
        pass in paremeters for all states in Customers*/
        super(preName, preBalance, preCart, preCartCost);  //call to super must be the first statement???

        this.vipCard = vipCard;
        this.years = years;

  
    }
    
    /*premium users get a 15% discount on all items in their cart, returns 
    the amount to be subtracted from the cartCost*/
    public double discountPrice (double sPrice) {

        if (Premium.title.equals("cashCows")) {
            /*adjust total cost of all items in the cart*/
            setCartCost(sPrice - (sPrice*0.15));
            return sPrice - (sPrice*0.15);
        }

        return 0.0d; //not a premium customer
    }

    /*removes all items from the cart, and subtract the cartCost from 
    the customer's balance*/
    public void buy () {
        String emptyCart[] = new String[0];
        setCart(emptyCart);

        /*update balance of customer*/
        setBalance(getBalance() - getCartCost());
        setCartCost(0d); //reset cost of items in the cart
    }

    /*Below are a list of mutators*/
    public void setVipCard (int vipCard) {
        this.vipCard = vipCard;
    } 

    public int getVipCard () {
        return vipCard;
    }

    public void setYears (int years) {
        this.years = years;
    }

    public int getYears () {
        return years;
    }

}
