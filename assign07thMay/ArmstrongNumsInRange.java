package assign07thMay;

import java.util.Scanner;

public class ArmstrongNumsInRange {

	static String findArmStrongNumsInRange(int startNum, int endNum) {
		String result = "";

		for (int i = startNum; i <= endNum; i++) {
			if (isArmstrong(i)) {
				result += i + " ";
			}
		}

		return result;
	}

	static boolean isArmstrong(int num) {
		boolean b = false;
		int temp = num;
		int num2 = 0;

		while (num > 0) {
			int a = num % 10;
			num2 = num2 + (a * a * a);
			num = num / 10;
		}
		if (temp == num2) {
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two  number");

		System.out.println(findArmStrongNumsInRange(scanner.nextInt(), scanner.nextInt()));
	}
}
