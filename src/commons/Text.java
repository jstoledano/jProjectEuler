package commons;

public class Text {
	
	public static String reverseNumber(int number) {
		String reverse = String.valueOf(number);
		StringBuilder sb = new StringBuilder(reverse);
		return sb.reverse().toString();
	}

}
