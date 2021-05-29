package assign06thMay;

import java.util.Scanner;

public class RangeWithStep {

	static String getNumbersInRange(int startNum, int endNum, int step) {

		String result = "";
		if (startNum < 0 || endNum < 0) {

			result += -1;

		} else if (startNum ==  endNum) {
			result += -2;
		} else if (startNum < endNum) {

			int i = startNum + 1;
			while (i < endNum) {

				result += i + " ";
				i=i+step;
			}

		} else {
			result += -3;
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers and Range");
		System.out.println(getNumbersInRange(scanner.nextInt(), scanner.nextInt(),scanner.nextInt()));
	}

}
