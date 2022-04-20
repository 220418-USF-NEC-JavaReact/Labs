public class driver {
    public static void main(String[] args) {
        StringMethods sentence = new StringMethods();

        System.out.println(sentence.replaceAllSpaces("Hello World! Gummy bunny"));

        System.out.println(sentence.containsWord("Hello my baby woRld Tee Heee", "heee"));
        String[] splitMe = sentence.splitPhoneNumber("123123-1231-231");
        
        System.out.println(splitMe[0]);
        System.out.println(splitMe[1]);
        System.out.println(splitMe[2]);
    }
}
