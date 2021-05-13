package assign06thMay;

import java.util.Scanner;

public class CreateBoxPattern {

	static String createBoxPatt(int val1, int val2) {
		String result = "";
		if (val1 < 0 || val2 < 0) {

			result += -1;
		} else if (val1 == 0 || val2 == 0) {
			result += -2;

		} else {
			for (int i = 1; i <= val1; i++) {
				for (int j = 1; j <= val2; j++) {
					if ((j == 1 || j == val2) || (i == 1 || i == val1)) {
						result += "*";
					} else {

						result += " ";
					}

				}
				result += "\n";
			}

		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		System.out.println(createBoxPatt(scanner.nextInt(), scanner.nextInt()));
	}

}
