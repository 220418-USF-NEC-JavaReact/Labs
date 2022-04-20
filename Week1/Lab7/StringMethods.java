public class StringMethods {

    public String replaceAllSpaces(String s){
        String newString = s.replace(' ', '-');
        return newString;
    }

    public boolean containsWord(String s, String s2){
        return (s.toLowerCase()).contains(s2);
    }

    public String[] splitPhoneNumber(String s){
        String[] number;
        number = s.split("-");
        return number;
    }
}
