public class StringMethods {

    public String replaceAllSpaces(String input) {
        String output = input.replace(' ','-');
        return output;
    }

    public boolean containsWord(String input, String searchWord) {
        input = input.toLowerCase();
        boolean output = input.contains(searchWord);
        return output;
    }

    public String[] splitPhoneNumber(String phoneNumber) {
        String[] output = phoneNumber.split("-");
        return output;
    }

}
