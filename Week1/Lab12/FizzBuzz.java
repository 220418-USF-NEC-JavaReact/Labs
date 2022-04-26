public class FizzBuzz {

    // Please place the logic to the coding problem in the method below
    public String fizzBuzz(int n) {
        /**
         * If the number N is divisible by 3, 5, both or none
         * return "Fizz", "Buzz", "FizzBuzz" or the number correspondingly
            If the number N is divisible by 5 return "Buzz".
            If The number N is divisible by BOTH return "FizzBuzz"
            If none of the above are true, return the number N as a string
            
            rearrange the ordering of the checks above to make the program work properly
        */

        if(n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz";
        }
        else if(n % 3 == 0){
            return "Fizz";
        }
        else if(n % 5 == 0){
            return "Buzz";
        }
        else{
            return Integer.toString(n);
        }
    }

}