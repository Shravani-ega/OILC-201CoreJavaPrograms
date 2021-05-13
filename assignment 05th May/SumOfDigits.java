package assign5thMay;

import java.util.Scanner;

public class SumOfDigits {

	public static int getSumOfDigits(int givenNum) {
		int result = 0;
		if (givenNum > 10 && givenNum < 99) {
			int rem = givenNum % 10;
			int quo = givenNum / 10;

			result = rem + quo;

		} else if (givenNum < 0) {
			result = -3;

		} else if (givenNum > 99) {
			result = -2;
		} else {
			result = -1;
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(getSumOfDigits(scanner.nextInt()));
	}
}
