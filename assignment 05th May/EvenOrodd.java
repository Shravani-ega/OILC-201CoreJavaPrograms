package assign5thMay;

import java.util.Scanner;

public class EvenOrodd {

	static String isEvenOrOdd(int givenNum) {

		String result = "";

		if (givenNum <= 0) {
			result += "Invalid Input";
		} else if (givenNum % 2 == 0) {
			result += "Even";
		} else {
			result += "Odd";
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(isEvenOrOdd(scanner.nextInt()));
	}

}
