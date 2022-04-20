public class StringMethods {

  public String replaceAllSpaces(String s) {
    return s.replace(" ", "-");
  }

  public boolean containsWord(String inputWord, String searchWord) {
    String lowerInputWord = inputWord.toLowerCase();
    String lowerSearchWord = searchWord.toLowerCase();

   return inputWord.contains(lowerSearchWord) ? true : false;
  }

  public String[] splitPhoneNumber(String phoneNumber) {
    String[] splitPhoneNumber = phoneNumber.split("-");
    return splitPhoneNumber;
  }

}
