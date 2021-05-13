package assign07thMay;

import java.util.Scanner;

public class TwinPrimes {

	static String findPrime(int num1, int num2) {

		String result = "";

		for (int i = num1; i <= num2; i++) {

			if (((getPrime(i) == true) && getPrime(i + 2) == true)) {

				result += i + " " + (i + 2) + "\n";
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
		}if(count>1) {
			
			f=false;
			
		}
		return f;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two  number");

		System.out.println(findPrime(scanner.nextInt(), scanner.nextInt()));
	}
}
