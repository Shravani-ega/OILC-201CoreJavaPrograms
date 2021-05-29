package assign5thMay;

import java.util.Scanner;

public class Palindrome {

	public static int isPalindrome(int givenNum) {
		int result = 0;
		if (givenNum > 99 && givenNum < 1000) {

			int sum = 0;

			int temp = givenNum;
			while (givenNum > 0) {
				int r = givenNum % 10;
				sum = (sum * 10) + r;
				givenNum = givenNum / 10;
			}

			if (temp == sum) {
				result = 1;
			} else {
				result = 0;
			}

		} else if (givenNum < 0) {
			result = -1;

		} else {
			result = -2;
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(isPalindrome(scanner.nextInt()));
	}
}
