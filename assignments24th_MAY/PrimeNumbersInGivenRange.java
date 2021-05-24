package classAssin_24thMay;

import java.util.Scanner;

public class PrimeNumbersInGivenRange {

	static String findPrimeNumbers(int startNum, int endNum) {

		String result = "";

		for (int i = startNum; i <= endNum; i++) {

			if (isPrime(i)) {
				result += i + " ";
			}

		}

		return result;
	}

	static boolean isPrime(int num) {
		boolean result = false;
		int count = 0;
		for (int j = 1; j < num; j++) {

			if ((num % j) == 0) {

				count++;
			}
		}
		if (count == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");

		System.out.println(findPrimeNumbers(scanner.nextInt(), scanner.nextInt()));
	}

}
