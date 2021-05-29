package assign07thMayPatterns;

import java.util.Scanner;

public class PrimeNumbersInRange {

	static String findPrimes(int startNum, int endNum) {

		String result = "";
		int count = 0;
		for (int i = startNum; i <= endNum; i++) {

			for (int j = 1; j < i; j++) {

				if ((i % j) == 0) {

					count++;
				}
			}
			if (count == 1) {
				result += i + " ";
			}
			count = 0;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");

		System.out.println(findPrimes(scanner.nextInt(), scanner.nextInt()));
	}
}
