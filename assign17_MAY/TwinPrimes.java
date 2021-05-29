package assign17_MAY;

import java.util.Scanner;

public class TwinPrimes {

	static String getTwinPrimes(int num1, int num2) {

		String result = "";
		if (num1 <= 0 || num2 <= 0) {

			result += "Error";
		} else if (num1 > 100 || num2 > 100) {

			result += "Error";

		} else if (num1 >= num2) {
			result += "Error";
		} else {
			for (int i = num1; i <= num2; i++) {

				if (((getPrime(i) == true) && getPrime(i + 2) == true)) {

					result += i + " ," + (i + 2) + "; ";
				}
			}
		}
		return result;
	}

	static boolean getPrime(int num) {

		boolean f = true;
		int count = 0;
		for (int i = 1; i < num; i++) {

			if (num % i == 0) {
				count++;
			}
		}
		if (count > 1) {

			f = false;

		}
		return f;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two  numbers");
		System.out.println(getTwinPrimes(scanner.nextInt(), scanner.nextInt()));
	}

}
