package assign07thMay;

import java.util.Scanner;

public class AramStrongNumber {
	public static String checkArmstrong(int num) {
		String result = "";
		int temp = num;
		int num2 = 0;

		while (num > 0) {
			int a = num % 10;
			num2 = num2 + (a * a * a);
			num = num / 10;
		}
		if (temp == num2)
			result = "Armstrong Number";
		else
			result = "Not Armstrong Number";
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(checkArmstrong(scanner.nextInt()));
	}

}
