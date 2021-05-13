package assign07thMay;

import java.util.Scanner;

public class Fibonacci {

	static String findFibonacci(int num) {
		String result = "";

		if (num <= 0) {

			result += -1;

		} else {

			for (int i = 0; i <= num; i++) {

				result += i;

			}

		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(findFibonacci(scanner.nextInt()));
	}

}
