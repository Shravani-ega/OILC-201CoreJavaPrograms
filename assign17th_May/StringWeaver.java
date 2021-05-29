package assign17th_May;

import java.util.Scanner;

public class StringWeaver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String s1 = scanner.next();
		System.out.println("Enter String 2 :");
		String s2 = scanner.next();
		System.out.println(getWeavedString(s1, s2));
	}

	private static String getWeavedString(String s1, String s2) {
		String result = "";
		if (s1.length() == 0 || s2.length() == 0) {
			result += "-1";
		} else {

			if (s1.length() > s2.length()) {
				result += s1 + s2 + s1;
				return result;

			} else if (s1.length() < s2.length()) {
				result += s2 + s1 + s2;
				return result;

			} else if (s1.length() == s2.length()) {

				for (int i = 0; i < s1.length(); i++) {

					result += s1.charAt(i) + "" + s2.charAt(i);
				}
				return result;
			}
		}
		return result;
	}
}
