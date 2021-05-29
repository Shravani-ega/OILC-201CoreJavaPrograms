package assign17_MAY;

import java.util.Scanner;

public class CollatzSequence {
	static String getCollatzSequence(int num) {
		if (num <= 0) {
			return "" + -1;
		}

		String str = "";
		str = str + "" + num;
		int count = 0;
		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = (3 * num) + 1;
			}
			count++;
			str = str + " " + num;
		}
		if (count < 100) {
			return str;
		} else {
			return "Doesnot Converge";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(getCollatzSequence(scanner.nextInt()));
	}

}
