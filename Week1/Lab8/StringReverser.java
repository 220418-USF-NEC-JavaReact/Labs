public class StringReverser {

	// Create the method to reverse a string below
	public String reverse(String str) {
		StringBuilder reversedStr = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr.append(str.charAt(i));
		}

		return reversedStr.toString();
	}

}
