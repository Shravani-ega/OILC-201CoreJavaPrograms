package assign06thMay;

import java.util.Scanner;

public class CheckPrime {

	static String isPrime(int num) {
		String result = "";

		if (num < 0) {

			result += -1;

		} else if (num == 0 || num == 1) {

			result += -2;
		} else {
			result="false";
			int count=0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {

				count++;

				}
			}
			if(count==1) {
				result="true";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(isPrime(scanner.nextInt()));
	}

}
