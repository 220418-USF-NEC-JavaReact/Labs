class PremiumCustomer extends Customers implements Premium{


    private int vipCard;
    private int years;

    public PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vipCard, int years){
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }
    @Override
    public double discountPrice(double price){
        double newPrice = price * 85 / 100;
        return newPrice;
    }

    @Override
    public void buy(){
        String[] newCart = new String[0];
        setCart(newCart);
        double curCartCost = getCartCost();
        double newBalance = getBalance() - discountPrice(curCartCost);
        setBalance(newBalance);
        setCartCost(0.0);
        
        
    }



    

    public void setVipCard(int vipCard){
        this.vipCard = vipCard;
    }

    public int getVipCard(){
        return vipCard;
    }

    public void setYear(int years){
        this.years = years;
    }

    public int getYears(){
        return years;
    }

    @Override
    public String toString(){
        String sentence = "";
        sentence += getName() + ", ";
        sentence += getBalance() + ", ";
        sentence += getCart() + ", ";
        sentence += getCartCost() + ", ";
        sentence += Premium.title + ", ";
        sentence += getVipCard() + ", ";
        sentence += getYears();
        return sentence;
    }

}