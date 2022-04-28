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
       int res = n;
       for(int i=(n-1); i>1;i--){
           res *= i;
       }
       return res;
    };

    GenericInterface<String> reverse = (str) -> {
        StringBuilder res = new StringBuilder();
        for(int i=str.length()-1; i>=0;i--){
            res.append(str.charAt(i));
        }
        return res.toString();
    };

    public List<String> forEachReverse(List<String> lst){
        List<String> newList = new ArrayList<String>();
        for(String str: lst){
            newList.add(reverse.func(str));
        }
        return newList;
    }

}
