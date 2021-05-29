package assign06thMay;

import java.util.Scanner;

public class CheckPalindrome {
	static String isPalindrome(int num) {
		String result = "";

		if (num < 0) {

			result += -1;

		} else if (num >= 0 && num <= 9) {

			result += -2;
		} else {
			String res = "false";

			int sum = 0;

			int temp = num;
			while (num > 0) {
				int r = num % 10;
				sum = (sum * 10) + r;
				num = num / 10;
			}

			if (temp == sum) {

				res = "true";
			}
			result = res;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(isPalindrome(scanner.nextInt()));
	}

}
