public class StringReverser {

	// Create the method to reverse a string below
	public String reverse (String str) {
       
		String StringBuffer="";
        char ch;

		for (int index=0; index<str.length(); index++)
      	{
        	ch= str.charAt(index);
        	StringBuffer= ch+StringBuffer;
      	}
	  	return StringBuffer;
    }
}
