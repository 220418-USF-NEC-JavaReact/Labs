public class StringReverser {
	public String reverse(String toBeReversed){
		StringBuffer buffy = new StringBuffer();
		for(int i = toBeReversed.length() - 1; i > -1; i--){
			buffy.append(toBeReversed.charAt(i));
		}
		String answer = buffy.toString();
		return answer;
	}
	// Create the method to reverse a string below
}
