public class StringReverser {
	public String reverse(String a){
		char[] b = a.toCharArray();
		for(int c = 0; c < b.length/2; c++){
			char temp = b[c];
			b[c] = b[b.length - 1 - c];
			b[b.length -1 -c] = temp;
		}
		String d = String.valueOf(b);
		return d;
	}
	// Create the method to reverse a string below
}
