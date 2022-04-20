public class StringMethods {

    public String replaceAllSpaces(String str){

        char[] chars = str.toCharArray();

        for(int index = 0; index < str.length(); index++){
            if(chars[index]==' '){
                chars[index] = '-';
            }
        }

        return String.valueOf(chars);
    }

    public boolean containsWord(String input, String search){

        input = input.toLowerCase();
        return input.contains(search);
    }

    public String[] splitPhoneNumber(String pNumber){

        return pNumber.split("-");
    }

}
