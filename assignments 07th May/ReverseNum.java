package assign07thMay;

import java.util.Scanner;

public class ReverseNum {

	static int findReverse(int num) {

		int result = 0;
		
		while (num > 0) {
			int rem = num % 10;
			result = result * 10 + rem;
			num = num / 10;
		}
		

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(findReverse(scanner.nextInt()));
	}

}
