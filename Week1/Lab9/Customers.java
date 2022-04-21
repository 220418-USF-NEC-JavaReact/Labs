public abstract class Customers {

  // 1st requirement - public props
  public String name;
  public double balance;
  public String[] cart;
  public double cartCost;

  // 2nd requirement - all-args constructor
  public Customers(String name, double bal, String[] cart, double cartCost) {
    this.name = name;
    this.balance = bal;
    this.cart = cart;
    this.cartCost = cartCost;
  }

  // 3rd requirement - public methods
  public void addToCart(String item, double cost){
    this.cartCost += cost;
    String[] newTempCart = new String[this.cart.length];
    for (int i = 0; i < this.cart.length; i++){
      newTempCart[i] = this.cart[i];
    }
    this.cart[newTempCart.length + 1] = item;
    newTempCart = this.cart;
  }

  // 4th requirement - public abstract method
  public abstract void buy();
}