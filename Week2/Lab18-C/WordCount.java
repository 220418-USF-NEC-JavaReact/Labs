
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
        List<String> index = new ArrayList<String>();
        for(int i = 0; i < words.length; i++){
            if (!index.contains(words[i])){
                index.add(words[i]);
            }
        }
        int count = 0;
        for (String word: index){
            for(int i = 0; i < getWords.length(); i++){
                if (word.equals(words[i])){
                    count++;
                }
            }
            results.put(word, count);
            count = 0;
        }


            return results;
    }
}
