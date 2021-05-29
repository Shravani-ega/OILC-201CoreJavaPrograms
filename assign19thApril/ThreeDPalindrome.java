package assign19thApril;

class Palindrome {
	static boolean palindrom(String str) {

		int n = str.length();

		String x = "";
		x = x + str.charAt(n - 1) + str.charAt(n - 2) + str.charAt(n - 3);

		return str.equals(x);

	}
}

public class ThreeDPalindrome {

	public static void main(String[] args) {

		boolean result = Palindrome.palindrom(args[0]);
		System.out.println(result);
	}

}