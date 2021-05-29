package assign17_MAY;

import java.util.Scanner;

public class GenerateOddPalindrome {

	static String getOddPalindromeList(int startNum, int endNum) {
		String result = "";
		if (startNum <= 0 || endNum <= 0) {

			result += "Error";

		} else if (startNum < 100 || endNum > 999) {

			result += "Error";
		} else if (startNum > endNum) {

			result += "Error";
		} else {
			for (int i = startNum; i <= endNum; i++) {

				if ((isPalind(i) % 2) != 0) {

					result += i + " ";
				}
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
		System.out.println("Enter two  numbers");
		System.out.println(getOddPalindromeList(scanner.nextInt(), scanner.nextInt()));
	}

}
