import java.util.Map;
import java.util.HashMap;

public class WordCount {
    
    //Provide the logic to the problem in the method below
    public Map<String, Integer> count(String input){
        String[] s = input.split(" ");
        Map<String, Integer> res = new HashMap<>();

        for(int i = 0; i < s.length; i++) {
            if (res.containsKey(s[i])){
               res.put(s[i], res.get(s[i])+1);
            }else{
               res.put(s[i], 1);
           }
        }
    
        return res;
    }

}
