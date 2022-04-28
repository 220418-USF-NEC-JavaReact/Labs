
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class WordCount {

    //Provide the logic to the problem in the method below
    public Map<String, Integer> count(String input){
        
        Map<String, Integer> results = new HashMap<>();
        String getWords = input.toLowerCase();
        String[] words = getWords.split(" ");
     
        for(int i = 0; i < words.length; i++){
            // Since HashMap does not allow duplicate keys(Stirng in this case)
            // New value would repalce old value
           if (results.containsKey(words[i])){
               results.put(words[i], results.get(words[i])+1);
           }else{
               results.put(words[i], 1);
           }
        }
    
        return results;
    }
}
