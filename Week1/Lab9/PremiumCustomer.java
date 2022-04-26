class PremiumCustomer extends Customers implements Premium{

    private int vipCard;
    private int years;
    double discPrice;

    PremiumCustomer(int vipCard, int years, String name, double balance, String[] cart, double cartCost){
        
        super(name, balance, cart, cartCost);
        this.vipCard = vipCard;
        this.years = years;


    }

    public double discountPrice(double startPrice){
       discPrice = startPrice * 0.85;
        return discPrice;
        }

    public void buy(){
        balance = balance - discountPrice(cartCost);
       String[] newCart = new String[0];
       cart = newCart;
    }
       //Getters and Setters FML

       public String getName(){
           return this.name;
       }

       public void setName(String name){
           this.name = name;
       }

        public double getBalance(){
           return this.getBalance;
       }
        public void setBalance(double balance){
           this.balance = balance;
       }

        public String getCart(){
           return this.cart;
       }
       public void setCart(String cart){
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


    

}