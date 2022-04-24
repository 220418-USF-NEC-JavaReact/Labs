public class StringReverser {



	// Create the method to reverse a string below
		public String reverse(String str){
		StringBuilder str2 = new StringBuilder();

		for(int i = str.length() -1 ; i>= 0;i--){
			str2.append(str.charAt(i));

		}
		str = str2.toString();
		return str;
	}
}
