package classAssin_24thMay;

import java.util.Scanner;

public class OddChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");

		System.out.println("Given Number " + oddChecker(scanner.nextInt()));
	}

	private static String oddChecker(int number) {
		String result = "";
		if (number % 2 == 0) {
			result += number + " is Odd";

		} else {

			result += number + " is Not Odd";
		}

		return result;
	}

	}


