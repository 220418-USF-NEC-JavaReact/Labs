public class StringReverser {
	// Create the method to reverse a string below


	public String reverse(String string) {
		StringBuilder reverseString = new StringBuilder();
		for(int i = string.length() - 1;i >= 0;i--){
			reverseString.append(string.charAt(i));
		}
		
		String finalString = reverseString.toString();
		
		
		
		return finalString;
	}
}
