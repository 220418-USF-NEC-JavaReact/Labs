public class StringReverser {

	// Create the method to reverse a string below
	public String reverse( String curString ) {
		StringBuilder buffString = new StringBuilder();

		for (int i = curString.length() - 1; i >= 0; i--) {
			buffString.append(curString.charAt(i));
		}

		return buffString.toString();
	}
}
