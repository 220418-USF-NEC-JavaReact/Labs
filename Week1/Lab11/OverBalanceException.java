class OverBalanceException extends Exception{
    public OverBalanceException(){
        super("The cart cost is more than the balance. ");
    }

    public OverBalanceException(String message){
        super(message);
    }
}