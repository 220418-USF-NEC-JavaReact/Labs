public class StringMethods {

    public String replaceAllSpaces(String replacedStr) {
        return replacedStr.replace(" ", "-");
    }

    public boolean containsWord(String firstStr, String secondStr) {
        String firstLowerCase = firstStr.toLowerCase();
        String secondLowerCase = secondStr.toLowerCase();

        return firstLowerCase.contains(secondLowerCase);
    }

    public String[] splitPhoneNumber(String phoneNumber) {
        return phoneNumber.split("-");
    }

}
