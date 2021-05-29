package assign07thMay;

import java.util.Scanner;

public class DecimalToBinary {

	    static void convertToBinary(int num) {
		int b[] = new int[40];
		int index = 0;
		while (num > 0) {
			b[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(b[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		convertToBinary(scanner.nextInt());
	}

}
