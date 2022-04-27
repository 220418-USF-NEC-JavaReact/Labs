import java.util.List;
import java.util.ArrayList;

// GenericInterface.java
@FunctionalInterface
interface GenericInterface<T> {

    // generic method
    T func(T t);
}

public class LambdaLab{

    GenericInterface<Integer> factorial = (Integer n) -> {
        int x = n.intValue();
        int y = n.intValue();
        while (x > 1){
            y *= x - 1;
            x--;
        }
        n = (Integer)(y);
        return n;
    };
    GenericInterface<String> reverse = (String str) -> {
        StringBuilder strbui = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            strbui.append(str.charAt(str.length() - i - 1));
        }
        str = strbui.toString();
        return str;
    }; 

    public List<String> forEachReverse (List<String> sList){
        List<String> newList = new ArrayList<>();
        for(String str : sList){
            String rev = reverse.func(str);
            newList.add(rev);
        }
        return newList;
    }
    // Provide the logic for the lab below


}
