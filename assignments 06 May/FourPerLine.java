package assign06thMay;

import java.util.Scanner;

public class FourPerLine {

	static String getFourPerLine(int num) {

		String result = "";

		if (num < 0) {
			result += -1;
		} else if (num == 0) {

			result += -2;
		} else if (num > 99) {
			result += -3;
		} else {

			for (int i = 1; i <= num; i++) {

				System.out.print(i + " ");
				if (i % 4 == 0) {
					System.out.println();

				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		System.out.println(getFourPerLine(scanner.nextInt()));
	}
}
