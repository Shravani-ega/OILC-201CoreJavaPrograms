package classAssin_24thMay;

import java.util.Scanner;

public class SwapThreeNumbersWithTemp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Any Three Numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		System.out.println("Before swaping:\n number1: " + num1 + "\n number2: " + num2 + "\n number3: " + num3);
		System.out.println(getSwap(num1, num2, num3));
		scanner.close();

	}

	public static String getSwap(int num1, int num2, int num3) {
		String result = "";
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = temp;
		result = "After swaping :\n number1: " + num1 + "\n number2: " + num2 + "\n number3: " + num3;
		return result;
	}

}
