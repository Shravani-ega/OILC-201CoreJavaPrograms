package assign19th_MAY;

import java.util.Scanner;

public class ConsonatsInName {

	static String displayVowels(String string) {

		String result = "";
		String str = string.toLowerCase();

		String vowels = "aeiou";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < vowels.length(); j++) {

				if (str.charAt(i) != vowels.charAt(j)) {
					count++;
				}
			}
			if (count == 5) {

				result += str.charAt(i) + " ";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name :");

		System.out.println("Consonants in the name are :" + displayVowels(scanner.nextLine()));
	}
}
