# Imagine we have the following code from earlier with one small change to `Customers`



```java
public abstract class Customers {
	public String name;
	public double balance;
	public String[] cart;
	public double cartCost;

	public Customers(String name, double balance, String[] cart, double cartCost){
		this.name = name;
		this.balance = balance;
		this.cart = cart;
		this.cartCost = cartCost;
	}

	public void addToCart(String item, double cost){
		String[] newCart = new String[cart.length + 1];
		for(int i = 0; i<cart.length; i++){
			newCart[i] = cart[i];
		}
		newCart[cart.length] = item;
		cart = newCart;
		cartCost += cost;
	}

	public abstract void buy() throws Exception;
}
```



```java
public interface Premium {
	String title = "Premium";

	double discountPrice(double cost);
}
```



```java
public class PremiumCustomer extends Customers implements Premium {

	private int vipCard;
	private int years;

	public PremiumCustomer(String name, double balance, String[] cart, double cartCost, int vipCard, int years){
		super(name, balance, cart, cartCost);
		this.vipCard = vipCard;
		this.years = years;
	}

	public double discountPrice(double cost){
		return this.cartCost * .85;
	}

	public void buy(){
		this.balance = balance - this.discountPrice(cartCost);
		this.cart = new String[0];
		this.cartCost = 0.0;
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
		String ret = "Name: " + this.name + " Balance: " + this.balance + " Cart: [";
		for(int i=0; i<cart.length; i++){
			ret += cart[i];
			if(i != cart.length - 1){
				ret += ",";
			}
		}
		ret += "] Cart Cost: " + this.cartCost + " Title: " + this.title + " VIP Card: " + this.vipCard + " Years: " + this.years;
	       return ret;
	}
}

```

## Create a checked exception called `OverBalanceException`

Create a parameterized and no-args constructor for the OverBalanceException

## Refactor the PremiumCustomer code

1. In the `buy` method check to see if the Customer currently has enough balance to purchase whats in their cart.

-   If they don't have enough balance, throw a new `OverBalanceException`
-   DO NOT remove the items from the cart, reset the cartCost, or subtract from the balance

## After you have completed the `OverBalanceException.java` file compile it

## Recompile the `PremiumCustomer.java` file after refactoring

## Run the `Lab11.class` file to see if you have successfully completed the lab
