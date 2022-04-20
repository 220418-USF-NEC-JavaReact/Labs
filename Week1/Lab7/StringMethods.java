public class StringMethods {
    public String replaceAllSpaces(String a){
        char[] b = a.toCharArray();
        for(int c = 0; c < a.length(); c++){
            char d = a.charAt(c);
            if( d == ' '){
                b[c] = '-';
            }
        }
        String e = String.valueOf(b);
        return e;
    }
    public boolean containsWord(String a, String b){
        String one = a.toLowerCase();
        String two = b.toLowerCase();
        return one.contains(two);
    }
    public String[] splitPhoneNumber(String a){
        String[] phone = a.split("-", 0);
        return phone;
    }
}
