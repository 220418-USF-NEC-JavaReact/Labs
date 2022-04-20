class WordDriver{
    public static void main(String args[]){
     Word noargsWord = new Word();
     System.out.println(noargsWord.wordLength());  
     Word varargsWord = new Word('H', 'e', 'l','l', 'o');
     System.out.println(varargsWord.wordLength());
     System.out.println(varargsWorletterAtIndex(0));
      System.out.println(varargsWorletterAtIndex(1));
       System.out.println(varargsWorletterAtIndex(2));
        System.out.println(varargsWorletterAtIndex(3));
         System.out.println(varargsWorletterAtIndex(4));
         
         char[] word1 = {'H', 'e', 'l', 'l', 'o'};
         char[] word1 = {'W', 'o', 'r', 'l', 'd', '!'};

         Sentence s = new Sentence(word1, word2);
         System.out.print(s.getWordAtIndex(1).length);
    }
}