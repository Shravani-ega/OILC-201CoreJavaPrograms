package assign07thMay;

import java.util.Scanner;

public class CollatzSequence {

	static String getCollatzSeq(int n) {
		String str = "";
		str = str + "" + n;
		int count = 0;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (3 * n) + 1;
			}
			count++;
			str = str + " " + n;
		}
		if (count < 100) {
			return str;
		} else {
			return "Doesnot Conerge";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(getCollatzSeq(scanner.nextInt()));

	}

}
