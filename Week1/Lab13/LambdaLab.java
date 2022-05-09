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
    @Overriden
    T funct(Integer t){
        GenericInterface<Integer> factorial = new GenericInterface<>();
        Integer y = 1;
        for(Interger x = t - 1; x > 0; x--){
            y = y * (x * t);
        }
        return y;
    }
    

}
