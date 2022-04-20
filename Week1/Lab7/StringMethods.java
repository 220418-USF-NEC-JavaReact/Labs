public class StringMethods {
    public String replaceAllSpaces(String toReplace){
        String newString = "";
        for(int i=0; i < toReplace.length(); i++){
            newString = toReplace.replace(' ', '-');
        }
        return newString;
    }

    public boolean containsWord(String checked, String checker){
        String newString = checked.toLowerCase();
        char firstChar = ' ';
        char secondChar = ' ';
        for(int i = 0; i < newString.length(); i++){
            if(newString.charAt(i) == checker.charAt(0)){
                for(int j = 0; j < checker.length(); j++){
                    firstChar = newString.charAt(i+j);
                    secondChar = checker.charAt(j);
                    if (firstChar != secondChar){
                         break;
                    }
                    if ((firstChar == secondChar) && (j == checker.length() - 1)){
                            return true;
                    }
                }
            }
        }
        return false;
    }
    public String[] splitPhoneNumber (String inputString){
        String answer[] = new String[3];
        int dashCounter = 0;
        int firstDash = 0;
        int secondDash = 0;
        while(dashCounter < 2){
            for(int i = 0; i < inputString.length(); i++){
                if ((inputString.charAt(i) == '-') && dashCounter == 0){
                    dashCounter++;
                    firstDash = i;
                }else if ((inputString.charAt(i) == '-') && dashCounter == 1){
                    dashCounter++;
                    secondDash = i;
                }
            }
        }
        String subStringOne = inputString.substring(0, firstDash);
        String subStringTwo = inputString.substring(firstDash + 1, secondDash);
        String subStringThree = inputString.substring(secondDash + 1, inputString.length());
        answer[0] = subStringOne;
        answer[1] = subStringTwo;
        answer[2] = subStringThree;
        return answer;
    }
}
