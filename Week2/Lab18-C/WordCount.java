import java.util.Map;
import java.util.HashMap;

public class WordCount {

    //Provide the logic to the problem in the method below
    public Map<String, Integer> count(String input) {
        Map<String, Integer> count = new HashMap<>();
        String term = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                term += input.charAt(i);
            } else {
                if (!count.containsKey(term)) {
                    count.put(term, 1);
                } else {
                    count.put(term, count.get(term) + 1);
                }
                term = "";
            }
        }
        return count;
    }


}
