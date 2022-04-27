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
    GenericInterface<Integer> factorial = (num) -> {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        
        return fact;
    };

    GenericInterface<String> reverse = (str) -> {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return reversedStr;
    };

    public List<String> forEachReverse(List<String> strList) {
        List<String> reversedStrList = new ArrayList<>();
        StringBuilder reversedString = new StringBuilder();

        strList.forEach(str -> {
            reversedString.append(str);
            reversedString.reverse();
            reversedStrList.add(reversedString.toString());
            reversedString.delete(0, reversedString.length());
        });

        return reversedStrList;
    }

}
