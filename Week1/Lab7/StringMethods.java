public class StringMethods {

    public String replaceAllSpaces(String i){
        char[] j = i.toCharArray();
        for(int k = 0; k < i.length(); k++){
            char l = i.charAt(k);
            if (l == ' ') {
                j[k] = '-';


            }
        } 
        String m = String.valueof(j);
        return m;

    }
    public boolean containsWord(String i, String j) {
        String one = i.toLowerCase();
        String two = j.toLowerCase();
        return one.contains(two);

    }
    public String[] splitCellNumber(String i) {
        String[] cell = a.split("_", 0);
        return cell;
    }

}
