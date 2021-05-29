package assign17_MAY;

import java.util.Scanner;

public class GeneratePalindrome {
	static String output = "";

	static String getPalindromeList(int num) {
		String result = "";

		if (num <= 0) {
			result += "Error";

		} else if (num < 100 || num > 999) {
			result += "Error";
		}

		else {

			int x, r, rev = 0, sum;
			x = num;
			output = output + x;
			while (num > 0) {
				r = num % 10;
				rev = rev * 10 + r;
				num = num / 10;
			}
			if (rev == x)
				return output;
			output = output + "," + rev + ",";
			sum = x + rev;
			result += sum;
			return getPalindromeList(sum);

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(getPalindromeList(scanner.nextInt()));
	}

}
