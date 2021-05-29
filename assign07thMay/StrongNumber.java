package assign07thMay;

import java.util.Scanner;

public class StrongNumber {

	static String isStrongNumber(int num) {
		String result = "";
		int temp = num;
		int sum = 0;

		while (num > 0) {
			int fact = 1;
			int rem = num % 10;

			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;
		}
	
		if (temp == sum) {

			result += "Given number " + temp + " is strong ";
		} else {
			result += "Not a Strong Number";
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(isStrongNumber(scanner.nextInt()));
	}

}
