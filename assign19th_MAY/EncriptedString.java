package assign19th_MAY;

import java.util.Scanner;

public class EncriptedString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();

		System.out.println("Encripted String :" + encriptedString(str));
	}

	static String encriptedString(String str) {

		String result = "";

		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			int index = 'z' - str.charAt(i);
			result += (char) ('a' + index);
		}
		return result;
	}
}
