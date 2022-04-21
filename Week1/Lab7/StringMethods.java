public class StringMethods {
    public String replaceAllSpaces(String str) {
        str = str.replaceAll(" ", "-");
        return str;
    }

    public boolean containsWord(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();
        if (first.contains(second)) {
            return true;
        } else{
            return false;
        }        
    }

    public String[] splitPhoneNumber(String phno) {
        return phno.split("-");
    }
}
