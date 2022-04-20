public class StringMethods {

    public String replaceAllSpaces(String paramater){
        String result = paramater.replaceAll(" ", "-");

        return result;
    }

    public boolean containsWord(String paramaterOne, String paramaterTwo){
        String inputString = paramaterOne.toLowerCase();
        String searchFor = paramaterTwo.toLowerCase();
        boolean result = inputString.contains(searchFor);

        return result;
    }

    public String[] splitPhoneNumber(String paramater){
        String[] result = paramater.split("-");

        return result;
    }
}
