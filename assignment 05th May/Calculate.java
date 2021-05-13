package assign5thMay;

import java.util.Scanner;

public class Calculate {

	static int calculate(int givenNum) {

		int result = 0;

		if (givenNum <= 0) {

			result = -1;

		} else if (givenNum % 2 == 0) {

			result = givenNum * givenNum;
		} else {

			result = givenNum * givenNum * givenNum;
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(calculate(scanner.nextInt()));
	}

}
