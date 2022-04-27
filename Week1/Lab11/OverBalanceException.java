

public class OverBalanceException extends Exception {
    private double amount;

    public OverBalanceException(){
        this.amount = 0;
    }

    public OverBalanceException(double amount){
        this.amount = amount;
    }
}