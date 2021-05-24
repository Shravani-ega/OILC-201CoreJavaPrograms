package classAssin_24thMay;

import java.util.Scanner;

public class PrimeNumbeChecker {
	static String isPrime(int num) {
		String result = "";

		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			result += num + " is Prime Number";
		} else {
			result += num + " is Not Prime Number";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(isPrime(scanner.nextInt()));
	}

}
