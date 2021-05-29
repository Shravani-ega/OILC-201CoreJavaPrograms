package assign5thMay;

import java.util.Scanner;

public class BooleanValue {

	static boolean countBoolean(boolean val1, boolean val2, boolean val3) {

		boolean result = false;

		int count = 0;

		if (val1 == true) {

			count++;
		}
		if (val2 == true) {
			count++;
		}
		if (val3 == true) {

			count++;

		} else {
			result = false;
		}
		if (count >= 2) {

			result = true;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		System.out.println(countBoolean(scanner.nextBoolean(), scanner.nextBoolean(), scanner.nextBoolean()));
	}

}
