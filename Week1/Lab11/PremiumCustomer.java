public class PremiumCustomer extends Customers implements Premium {

	private int vipCard;
	private int years;

	public PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vipCard, int years) {
		super(name, balance, cart, cartCost);
		this.vipCard = vipCard;
		this.years = years;
	}

	public double discountPrice(double cost) {
		return this.cartCost * .85;
	}

	public void buy() throws OverBalanceException{

		if (balance > this.discountPrice(cartCost)){
			this.balance = balance - this.discountPrice(cartCost);
			this.cart = new String[0];
			this.cartCost = 0.0;
		} else if (balance < this.discountPrice(cartCost)){
			throw new OverBalanceException(balance, cartCost);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String[] getCart() {
		return this.cart;
	}

	public void setCart(String[] cart) {
		this.cart = cart;
	}

	public double getCartCost() {
		return this.cartCost;
	}

	public void setCartCost(double cartCost) {
		this.cartCost = cartCost;
	}

	public int getVipCard() {
		return this.vipCard;
	}

	public void setVipCard(int vipCard) {
		this.vipCard = vipCard;
	}

	public int getYears() {
		return this.years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		String ret = "Name: " + this.name + " Balance: " + this.balance + " Cart: [";
		for (int i = 0; i < cart.length; i++) {
			ret += cart[i];
			if (i != cart.length - 1) {
				ret += ",";
			}
		}
		ret += "] Cart Cost: " + this.cartCost + " Title: " + this.title + " VIP Card: " + this.vipCard + " Years: "
				+ this.years;
		return ret;
	}
}
