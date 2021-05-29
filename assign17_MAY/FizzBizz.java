package assign17_MAY;

import java.util.Scanner;

public class FizzBizz {

	public static String getFizzBizz(int num) {
		String result = "";

		if (num <= 0) {

			result += "Error";
		} else {
			if (num % 3 == 0 && num % 5 == 0) {
				result = "FizzBizz";
			} else if (num % 3 == 0) {
				result = "Fizz";
			} else if (num % 5 == 0) {
				result = "Bizz";
			} else {
				result = "" + num;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(getFizzBizz(scanner.nextInt()));
	}

}
