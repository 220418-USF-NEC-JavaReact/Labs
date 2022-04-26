public class Driver {
    public static void main(String[] args) {
        //String name, double balance, String[] cart, double cartCost, int vipCard, int years
        String[] arr = {"bike", "gloves"};
        PremiumCustomer cust = new PremiumCustomer("dawit", 199, arr, 200, 1234, 2);
        

        try  {  
            cust.buy();  
        }  
        catch (OverBalanceException ex){   
            System.out.println(ex);  
        }  
  
        System.out.println(cust.toString());    
    }
}
