package assign07thMay;

import java.util.Scanner;

public class Factors {
	static String findFactors(int givenNum) {
		String result = "";

		if (givenNum <= 0) {

			result += "Please Enter a positive Number";
		} else {
			for (int i = 1; i < givenNum; i++) {

				if (givenNum % i == 0) {

					result += i+" ";
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(findFactors(scanner.nextInt()));
	}

}
