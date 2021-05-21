package assign17_MAY;

import java.util.Scanner;

public class StringWeaver {

	private static String getWeavedString(String string1, String string2) {
		String result = "";
		if (string1.length() == 0 || string2.length() == 0) {
			result += "-1";
		} else {

			if (string1.length() > string2.length()) {
				result += string1 + string2 + string1;
				return result;

			} else if (string1.length() < string2.length()) {
				result += string2 + string1 + string2;
				return result;

			} else if (string1.length() == string2.length()) {

				for (int i = 0; i < string1.length(); i++) {

					result += string1.charAt(i) + "" + string2.charAt(i);
				}
				return result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String string1 = scanner.next();
		System.out.println("Enter String 2 :");
		String string2 = scanner.next();

		System.out.println(getWeavedString(string1, string2));
	}
}
