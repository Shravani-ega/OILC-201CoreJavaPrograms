package classAssin_24thMay;

import java.util.Scanner;

public class EvenChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");

		System.out.println("Given Number " + evenChecker(scanner.nextInt()));
	}

	private static String evenChecker(int number) {
		String result = "";
		if (number % 2 == 0) {
			result += number + " is Even";

		} else {

			result += number + " is Not Even";
		}

		return result;
	}

}
