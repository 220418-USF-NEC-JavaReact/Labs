public class StringMethods {

    public String replaceAllSpaces(String args){

        String replacedString = args.replace(" ", "-");
        return replacedString;


    }

    public boolean containsWord(String args, String arg) {
       String firstString = args.toLowerCase();
       String secondString = arg.toLowerCase();
       boolean answer = firstString.contains(secondString);
         
        return answer;
    }

    public String[] splitPhoneNumber(String phonenumber){
         
        String[] splitNumber = phonenumber.split("-");
        return splitNumber;
    }

}
