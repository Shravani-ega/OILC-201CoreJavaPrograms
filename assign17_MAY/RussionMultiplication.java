package assign17_MAY;

import java.util.Scanner;

public class RussionMultiplication {
	private static int getProduct(int num1, int num2) {

		int product = 0;
		if (num1 > 0 && num2 > 0) {
			if (num1 % 2 != 0)
				product = product + num2;
			while (num1 != 1) {
				num1 = num1 / 2;
				num2 = num2 * 2;
				if (num1 % 2 != 0)
					product = product + num2;
			}

			return product;
		} else
			return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println(getProduct(scanner.nextInt(), scanner.nextInt()));
	}

}
