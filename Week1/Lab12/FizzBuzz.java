public class FizzBuzz {

    // Please place the logic to the coding problem in the method below
    public String fizzBuzz(int n) {
        Integer num = n;

        if((n%3 == 0) & (n%5 == 0)){
            return "FizzBuzz";
        } else if (n%3 == 0) {
            return "Fizz";
        } else if(n%5 == 0) {
            return "Buzz";
        }
        return num.toString();
    }

}