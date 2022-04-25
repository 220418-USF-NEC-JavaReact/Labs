public class StringReverser {

	// Create the method to reverse a string below

	public String reverse(String input){
		StringBuilder s1 = new StringBuilder(input);
		int l1 = input.length();


		//append reversed string to original string
		for (int i = (l1-1); i >= 0; i--){
			s1.append(s1.charAt(i));
		}

		//delete original string
		s1 = s1.delete(0,l1);
		String output = s1.toString();

		return output;

	}
}
