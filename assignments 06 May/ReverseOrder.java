package assign06thMay;

import java.util.Scanner;

public class ReverseOrder {

	public static String getNumbersInRange(int startNum, int endNum) {
		String result = "";
		if (startNum < 0 || endNum < 0) {

			result += -1;
		} else if (startNum == endNum) {

			result += -2;
		} else if (startNum < endNum) {

			result += -3;
		} else if ((startNum - endNum) == 1) {

			result += -4;
		} else {
			for (int i = startNum - 1; i > endNum; i--) {

				result += i + " ";
			}

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		System.out.println(getNumbersInRange(scanner.nextInt(), scanner.nextInt()));
	}

}
