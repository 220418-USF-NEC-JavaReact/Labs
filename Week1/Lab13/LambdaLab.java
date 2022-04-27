import java.util.List;
import java.util.ArrayList;

// GenericInterface.java
@FunctionalInterface
interface GenericInterface<T> {

    // generic method
    T func(T t);
}

public class LambdaLab {

    // Provide the logic for the lab below
    GenericInterface<Integer> factorial = (n) -> {
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    };

    GenericInterface<String> reverse = (s) -> {
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    };

    public List<String> forEachReverse(List<String> listString) {
        List<String> sol = new ArrayList<String>();
        listString.forEach((s) -> {
            String rev = "";
            for(int i = s.length()-1; i >= 0; i--) {
                rev += s.charAt(i);
            }
            sol.add(rev);
        });
        return sol;
    }
}
