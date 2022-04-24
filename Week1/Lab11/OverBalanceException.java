public class OverBalanceException extends Exception {
    public OverBalanceException() {
        super("The cart's cost is more than the balance you have.");
    }

    public OverBalanceException(String message) {
        super(message);
    }
}
