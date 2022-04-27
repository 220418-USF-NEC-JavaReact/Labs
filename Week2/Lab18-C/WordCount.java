import java.util.Map;
import java.util.HashMap;

public class WordCount {
    
    //Provide the logic to the problem in the method below
    public Map<String, Integer> count(String input){
        Map<String, Integer> found = new HashMap<>();
        String[] words = input.split(" ");
        for(int i = 0; i < words.length; i++) {
            if(found.containsKey(words[i])) {
                found.put(words[i], found.get(words[i])+1);
            } else {
                found.put(words[i], 1);
            }
        }
        return found;

    }

}
