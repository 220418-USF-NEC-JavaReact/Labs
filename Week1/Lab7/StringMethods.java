public class StringMethods {

    public String replaceAllSpaces(String s){
        StringBuilder noSpaces = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++) {
            if(noSpaces.charAt(i) == ' ') {
                noSpaces.setCharAt(i, '-');
            }
        }
        return noSpaces.toString();
    }

    public boolean containsWord(String input, String find) {
        input = input.toLowerCase();
        if (input.contains(find)) {
            return true;
        }
        return false;
        
    }

    public String[] splitPhoneNumber(String phone) {
        String[] p = new String[3];
        p[0] = phone.substring(0,3);
        p[1] = phone.substring(4,7);
        p[2] = phone.substring(8,12);
        return p;
    }

}
