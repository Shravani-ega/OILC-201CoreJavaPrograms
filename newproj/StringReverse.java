package newproj;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A String :");
		String str = scanner.next();

		System.out.println(ispalindrome(str));
	}

	static String ispalindrome(String str) {
		String result = "";
		String resString = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			resString += str.charAt(i);

		}

		if (str.equals(resString)) {

			result += str + " is palindrome String";
		} else {

			result += str + " is  not palindrome ";
		}
		return result;
	}

}
