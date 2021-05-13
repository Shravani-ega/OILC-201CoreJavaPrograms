package assign06thMay;

import java.util.Scanner;

public class NumbersInRange {

	static String getNumbersInRange(int startNum, int endNum) {

		String result = "";
		if (startNum < 0 || endNum < 0) {

			result += -1;

		} else if (startNum == 0 || endNum == 0) {
			result += -2;
		} else if (startNum < endNum) {

			int i = startNum+1;
			while (i < endNum) {

				result += i + " ";
				i++;
			}

		} else {
			result += -3;
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		System.out.println(getNumbersInRange(scanner.nextInt(), scanner.nextInt()));
	}
}
