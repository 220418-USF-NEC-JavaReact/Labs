public class StringMethods {
    // replace spaces with dashes
    public String replaceAllSpaces(String x){
        x.replace(' ', '-');
        return x;
    }

    // search word
    public boolean containsWord(String inputWord, String searchWord){
        inputWord.toLowerCase();
        return inputWord.contains(searchWord);
    }

    // split string at '-' char
    public String[] splitPhoneNumber(String phoneNumber){
        String[] result = phoneNumber.split("-");
        return result;
    }
}
