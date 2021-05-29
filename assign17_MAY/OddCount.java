package assign17_MAY;

import java.util.Scanner;

public class OddCount {

	static String getOddCount(int[] array) {

		String result = "";
		int zero = 0;
		int even = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] <= 0) {
				zero++;
			}
			if (array[i] % 2 == 0) {
				even++;
			}
		}
		if (array.length != 5) {
			result += -1;

		} else if (zero >= 1) {
			result += -2;
		} else if (even == array.length) {
			result += -3;
		} else if (array.toString() == null) {

			result += -4;
		} else {
			int odd = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 != 0) {
					odd++;

				}
			}
			result += odd;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of the Array :");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " Elements :");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();
		}
		System.out.println(getOddCount(arr));

	}

}
