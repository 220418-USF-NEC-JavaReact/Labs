public class FizzBuzz {

    // Please place the logic to the coding problem in the method below
    public String fizzBuzz(int n) {
        String sol = "";
        if(n % 3 == 0) {
            sol += "Fizz";
        }
        if(n % 5 == 0) {
            sol += "Buzz";
        }
        if(sol.equals("")) return Integer.toString(n);
        return sol;
    }

}