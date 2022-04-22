public class FizzBuzz {

    // Please place the logic to the coding problem in the method below
    public String fizzBuzz(int n) {
        String resultString = "";
        if( n%3 == 0 && n%5 == 0){
            resultString = "FizzBuzz";
        } else if (n%3 == 0){
            resultString = "Fizz";
        } else if (n%5 == 0) {
            resultString = "Buzz";
        } else {
            resultString = String.valueOf(n);           
        }
        return resultString;
    }

}