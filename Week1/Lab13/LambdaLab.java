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
    GenericInterface<Integer> factorial  = t -> {
        int buffer = t.intValue();

        for (int i = t-1; i > 0; i--) {
            buffer *= i;
        }

        Integer wrap = buffer;

        return wrap;
    };

    GenericInterface<String> reverse = s -> {
        StringBuilder r = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            r.append(s.charAt(i));
        }

        return r.toString();
    };

    /*-----------------------------------------------------------------------
    Task: loops through an existing List of Strings and reverses the sequence 
    of each string. Copy new stirngs into another list
    input: List<String>
    output: List<String> 
    -----------------------------------------------------------------------*/
    public List<String> forEachReverse (List<String> ogString) {
        List<String> r1 = new ArrayList<>();
        StringBuilder buff = new StringBuilder();

        ogString.forEach(n -> {
            buff.append(n);
            buff.reverse();
            r1.add(buff.toString());
            buff.delete(0, buff.length()); //clear the buffer

        } );



        return r1;
    }

}
