import java.util.ArrayList;
public class PremiumCustomer extends Customers implements Premium {

    int vipCard;
    int years;

    public PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vipCard, int years) {
        super(name, balance, cart, cartCost);
        this.name = name;
        this.balance = balance;
        this.cart = cart;
        this.cartCost = cartCost;
        this.vipCard = vipCard;
        this.years = years;
        

        //TODO Auto-generated constructor stub
    }

    public int getVipCard(){return vipCard;}

    public void setVipCard(int vipCard) {this.vipCard = vipCard;}
    public int getYears(){return years;}

    public void setYears(int years) {this.years = years;}


    public double discountPrice(double cost) {

        return cost * 0.85;
    }

    @Override
    public void buy() {
        setBalance(getBalance()-discountPrice(getCartCost()));
        String[] newCart = new String[0];
        setCart(newCart);
        setCartCost(0.0);

    }

    public String toString(){

       String sb = new String();
       for (int i=0;i<this.cart.length;i++) {
           sb = cart[i] + " ";
       }


        String objectString = "";
        objectString += "Name: " + getName() + "\n";
        objectString += "Balance: " + getBalance() + "\n";
        objectString += "Cart: " + sb + "\n";
        objectString += "Cart Cost: " + getCartCost() + "\n";
        objectString += "VIP Card: " + getVipCard() + "\n";
        objectString += "Years Customer: " + getYears() +"\n";
        return objectString;
    }


    
}
