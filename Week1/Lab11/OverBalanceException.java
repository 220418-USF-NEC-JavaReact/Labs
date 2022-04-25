public class OverBalanceException extends Exception {

    public OverBalanceException() {
        super("You cannot afford the items in your cart");
    }

    public OverBalanceException(String message) {
        super(message);
    }

}