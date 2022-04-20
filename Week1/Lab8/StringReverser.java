public class StringReverser {

	// Create the method to reverse a string below
	public String reverse(String reversedNumber) {

		String numberIsReversed = "";
		char characters;

		for (int i = 0; i < reversedNumber.length(); i++) {
			characters = reversedNumber.charAt(i);
			numberIsReversed = characters + numberIsReversed;
		}

		return numberIsReversed;
	}
}
