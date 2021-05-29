package assign19th_MAY;

import java.util.Scanner;

public class VowelsInName {

	static String displayVowels(String string) {
		String str = string.toLowerCase();

		String result = "";

		String vowels = "aeiou";
		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; j < vowels.length(); j++) {

				if (str.charAt(i) == vowels.charAt(j)) {
					result += str.charAt(i) + " ";

				}

			}

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name :");

		System.out.println("Vowesl in the Name are :" + displayVowels(scanner.nextLine()));
	}
}
