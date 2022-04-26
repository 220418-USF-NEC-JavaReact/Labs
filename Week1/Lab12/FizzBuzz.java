public class FizzBuzz {

    // Please place the logic to the coding problem in the method below
    public String fizzBuzz(int n) {
        if( (n % 3) == 0 && (n % 5) == 0  ){
            return "FizzBuzz";
        }else if( (n % 5) == 0 ){

            return "Buzz";

        }else if( (n % 3) == 0 ){
            return "Fizz";
        } else {

            return Integer.toString(n);
        }
    }

}