package assign07thMay;

import java.util.Scanner;

public class OddPalindrome {

	static String oddPalindrome(int startNum, int endNum) {
		String result = "";

		for (int i = startNum; i <= endNum; i++) {

			if ((isPalind(i) % 2) != 0) {

				result += i + " ";
			}

		}
		return result;
	}

	static int isPalind(int num) {
		int result = 0;
		int sum = 0;
		int temp = num;

		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}

		if (sum == temp) {

			result = sum;
		}

		return result;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number");

		System.out.println(oddPalindrome(scanner.nextInt(), scanner.nextInt()));

	}

}
