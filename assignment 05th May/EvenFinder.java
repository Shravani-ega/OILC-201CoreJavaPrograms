package assign5thMay;

import java.util.Scanner;

public class EvenFinder {

	static int isEven(int num) {
		int result = 0;

		if (num <= 0) {
			result = -1;
		} else {

			if (num % 2 == 0) {
				result = 1;
			} else {
				result = 0;
			}

		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(isEven(scanner.nextInt()));
	}

}
