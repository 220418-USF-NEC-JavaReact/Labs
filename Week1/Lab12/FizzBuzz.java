public class FizzBuzz {

    // Please place the logic to the coding problem in the method below
    public String fizzBuzz(int n) {
        if((n % 3) == 0){
            if((n % 5) == 0){
                return "FizzBuzz";
            }else{
                return "Fizz";
            }
        }else if((n % 5) == 0){
            return "Buzz";
        }
            return Integer.toString(n);
    }

}