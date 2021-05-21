package assign17_MAY;

import java.util.Scanner;

public class IncrDecr {

	static int[] getIncreaseDecrease(int number) {
		int[] arr = new int[number];
		if (number > 1 && number < 20) {
			int num = 1;
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					arr[i] = num;
					num++;

				} else {

					arr[i] = number;
					number--;
				}
			}

		} else {

			return null;
		}
		return arr;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int[] increaseDecrease = getIncreaseDecrease(scanner.nextInt());
		for (int x : increaseDecrease) {
			System.out.println(x);
		}
	}

}
