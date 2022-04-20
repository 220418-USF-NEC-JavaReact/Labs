public class StringReverser {

	// Create the method to reverse a string below
	public String reverse(String s) {
		String s2 = "";
		char c;

		for(int i=0; i<s.length(); i++){
			c=s.charAt(i);
			s2 = c + s2;
		}

		return s2;
	}
}
