public class salesDriver {
    public static void main(String[] args) {
        String[] newCart = new String[0];

        PremiumCustomer cust01 = new PremiumCustomer ("Robert", 543.67d, newCart, 0.0d, 123, 10);

        cust01.addToCart("shirt", 4.54d);
        cust01.addToCart("blue shirt", 7.52d);
        cust01.addToCart("green shirt", 9.73d);

        for(int i = 0; i < cust01.getCart().length; i++) {
            System.out.println("Item: " + cust01.getCart()[i]);
        }
        System.out.println("Total: " + cust01.getCartCost());

        double discount = cust01.discountPrice(cust01.getCartCost());
        System.out.println("Discount: " + discount);

        cust01.buy();

        System.out.println("Items Bought!, new balance: " + cust01.getBalance());
        System.out.println("Total cost of items in cart: " + cust01.getCartCost());
        
    }
}
