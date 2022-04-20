public class StringMethods {

    public String replaceAllSpaces (String usrString) {
        char[] strBuffer = new char[usrString.length()];

        for (int i = 0; i < usrString.length(); i++) {
            if (usrString.charAt(i) == ' ') {
                strBuffer[i] = '-';

            } else {
                strBuffer[i] = usrString.charAt(i);

            }
        }

        String newString = String.valueOf(strBuffer);

        //return newString;

        return usrString.replace(' ', '-'); //there was a method for that lol
    }

    //accepts two strings, returns true is second string is found within the first
    public boolean containsWord (String inWord, String searchWord) {
        inWord = inWord.toLowerCase();

        return inWord.contains(searchWord);
    }

    //accepts a String and a char, determines which index the symbol is located at, returns an array of indexes where the string can be found
    private int[] splitIndices (String phoneNumber, char symbol) {
        int count = 0; // number of splits based on 'symbol' for memory allocation
        for(int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) == symbol){
                count++;
            }
        }
        count++;

        int[] indexLoc = new int[count];
        int j = 0; //index iterator for indexLoc
        int i = 0; //index iterator for the loop

        while (i < phoneNumber.length()) {
            if(phoneNumber.charAt(i) == '-') {
                indexLoc[j] = i;
                j++;
            }
            i++;
        }
        //line used to get the loop in 'splitPhoneNumber to iterate until the last variable in phone number string
        //otherwise it will only copy chars up to the last known index where the symbol is found
        indexLoc[count - 1] = phoneNumber.length(); //created an int array of size 'count', last index is 'count - 1'
        
        return indexLoc;
    }

    public String[] splitPhoneNumber (String phoneNum) {
        //memory allocation for string by counting number of splits needed
        int count = 0;
        int i = 0;

        while (i < phoneNum.length()) {
            if (phoneNum.charAt(i) == '-') {
                count++;
            }
            i++;
        }

        String[] split = new String[count + 1];
        int[] indexLocations = splitIndices(phoneNum, '-');
        int phoneIndex = 0; // iterator for phone index

        //number or splits = number of elements in the String Array
        for(i = 0; i < count + 1; i++) {

            //create a character array of sections to be split
            char[] strBuffer = new char[indexLocations[i]-phoneIndex];

            int bufferIndex = 0;

            for(int j = phoneIndex; j < indexLocations[i]; j++) {
                strBuffer[bufferIndex] = phoneNum.charAt(phoneIndex);
                bufferIndex++;
                phoneIndex++;
            }
            split[i] = String.valueOf(strBuffer);
            phoneIndex++;
        }

        return split;
    }
}
