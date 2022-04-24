public class StringMethods {

    public String replaceAllSpaces(String x){
       x = x.replace(' ', '-');
        return x;
    }

    public boolean containsWord(String x, String y){
        x = x.toLowerCase();
        return x.contains(y);

    }

    public String[] splitPhoneNumber(String x){
        String formatString[] = x.split("-");
        

        return formatString;

        }





    }



