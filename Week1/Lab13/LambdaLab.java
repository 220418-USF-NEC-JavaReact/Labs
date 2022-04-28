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
    GenericInterface<Integer> factorial = (Integer n) -> {
        int product = n.intValue();
        int factorial = product - 1;
        while(factorial > 1){
            product *= factorial;
            factorial--;
        }
        return (Integer)product;
    };
    GenericInterface<String> reverse = (String words) -> {
        // Similar as Lab8
        String result = new StringBuilder(words).reverse().toString();
		return result;
    };

    public List<String> forEachReverse(List<String> list){
        List<String> result = new ArrayList<String>();
        for(String word: list){
            //Need to add func 
            result.add(reverse.func(word));

        }
        return result;
    }


}
