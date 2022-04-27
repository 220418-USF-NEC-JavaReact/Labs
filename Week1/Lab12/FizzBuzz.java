public class FizzBuzz {

    // Please place the logic to the coding problem in the method below
    public String fizzBuzz(int n) {
        String res = "";
        if(n%3==0 && n%5==0){
           res = "FizzBuzz";
        } else if(n%5==0){
            res = "Buzz";
        } else if(n%3==0){
            res = "Fizz";
        } else{
            res = Integer.toString(n);
        }

        return res;
    }
}