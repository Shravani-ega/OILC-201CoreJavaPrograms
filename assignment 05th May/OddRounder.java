package assign5thMay;

import java.util.Scanner;

public class OddRounder {

	static int oddRounder(int number) {

		int result = 0;
		if (number < 0) {

			result = -1;
		} else if (number == 0) {

			result = -2;
		} else if (number % 2 == 0) {

			result = number;
		} else {

			result = ((number / 10) + 1) * 10;
		}

		return result;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(oddRounder(scanner.nextInt()));

	}

}
