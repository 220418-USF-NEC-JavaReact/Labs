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

    GenericInterface<Integer> factorial = (n) ->  {
      int result = 1;

      for(int i=1; i <= n; i++)
        result = i * result;

      return result;
    };

    GenericInterface<String> reverse = (s) ->{

        StringBuffer sr = new StringBuffer(s);
        return sr.reverse().toString();
    };

    public List<String> forEachReverse(List<String> ls){
        List<String> rl = new ArrayList<>();
        ls.forEach((s) -> {rl.add(reverse.func(s));});
        return rl;
    }

}
