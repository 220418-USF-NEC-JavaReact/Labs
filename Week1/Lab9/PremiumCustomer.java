class PremiumCustomer extends Customers implements IPremium{

  // 2nd requirement
  private int vipCard;
  private int years;

  // 3rd requirement
  public PremiumCustomer(String name, double bal, String[] cart, double cartCost, int vCard, int years) {
    super(name, bal, cart, cartCost);
    this.vipCard = vCard;
    this.years = years;
  }

  // 4th reqquirement - implementing interface method
  @Override
  public double discountPrice(double discount){
    double newPrice = discount * (0.15);
    return newPrice;
  }

}