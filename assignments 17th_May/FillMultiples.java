package assign17_MAY;

import java.util.Scanner;

public class FillMultiples {
	static int[] getMultiplesArray(int num) {
		int[] mul = new int[10];
		if (num <= 0) {

			mul[num] = (Integer) null;

		}
		for (int i = 1; i <= 10; i++) {

			mul[i - 1] = num * i;
		}
		return mul;
	}

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number");
			int[] array = getMultiplesArray(scanner.nextInt());
			for (int x : array) {
				System.out.println(x);
			}
		} catch (Exception e) {
			System.out.println("Null");
		}
	}
}
