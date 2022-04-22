public class FizzBuzz {

    // Please place the logic to the coding problem in the method below
    public String fizzBuzz(int n) {

        String ret= "";

        if(n % 3 == 0 && n % 5 == 0){
            ret = "FizzBuzz";
        }else if(n % 3 == 0){
            ret = "Fizz";
        }else if(n % 5 == 0){
            ret = "Buzz";
        }else
            ret = "" + n;

        return ret;
    }
}