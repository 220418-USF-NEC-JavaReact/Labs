public class OverBalanceException extends Exception {
    private double balance;
    private double cartCost;

    public OverBalanceException() {}

    public OverBalanceException(double balance, double cartCost) {
        this.balance = balance;
        this.cartCost = cartCost;
    }

    public void resetCartCost() {
        cartCost = 0.0;
    }
}