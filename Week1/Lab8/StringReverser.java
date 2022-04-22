public class StringReverser {

	// Create the method to reverse a string below
	
	public String reverse(String str) {

		StringBuilder reverseStr = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr.append(str.charAt(i));
		}

		return reverseStr.toString();
	}

}

	 


