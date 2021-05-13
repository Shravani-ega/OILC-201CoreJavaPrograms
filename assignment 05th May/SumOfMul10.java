package assign5thMay;

import java.util.Scanner;

public class SumOfMul10 {

	static int round(int num) {

		int res = 0;
		if (num % 10 == 0) {
			res = num;
		} else {
			res = ((num / 10) + 1) * 10;
		}

		return res;
	}

	static int sumOfMultiples(int num1, int num2, int num3) {
		int result = 0;

		if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
			result = -1;
		} else {

			result = round(num1) + round(num2) + round(num3);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		System.out.println(sumOfMultiples(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
	}

}
