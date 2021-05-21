package assign17_MAY;

import java.util.Scanner;

public class Adder {
	static String getSum(int firstNum, int secondNum) {
		String sum = "";

		if (firstNum <= 0 || secondNum <= 0) {

			sum += "Error";

		} else {

			sum += (firstNum + secondNum);
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println(getSum(scanner.nextInt(), scanner.nextInt()));
	}

}
