public class StringMethods {

    //Replace all the spaces to dash
    public String replaceAllSpaces(String x){
        x.replace(' ', '-');
        return x;
    }
      
    //search word
    public boolean containsWord(String inputWord, String searchWord){
       inputWord.toLowerCase();
       return inputWord.contains(searchWord);
     }

    //split String into an array
     public String[] splitPhoneNumber(String phoneNumber){
        String[] result = phoneNumber.split("-");
        return result;

     }





}
