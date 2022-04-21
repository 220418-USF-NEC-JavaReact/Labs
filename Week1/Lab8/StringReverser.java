public class StringReverser {

	// reverse a string
	public String reverse(String str){
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--)
		{
			sb.append(str.charAt(i));
		}
		String result = sb.toString();
		return result;
	}

	public static void main(String args[]){
		StringReverser str = new StringReverser();
		System.out.println(str.reverse("Word"));
	}
}
