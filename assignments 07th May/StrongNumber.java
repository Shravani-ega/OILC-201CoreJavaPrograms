package assign07thMay;

import java.util.Scanner;

public class StrongNumber {

	static String isStrongNumber(int num) {
		String result = "";

		while (num > 0) {
			int rem = num % 10;

			num = num / 10;
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(isStrongNumber(scanner.nextInt()));
	}

}
