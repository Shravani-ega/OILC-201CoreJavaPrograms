package assign17_MAY;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	static int sumOfArray(int arr[]) {

		int result = 0;
		int neg = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				neg++;
			}
		}
		if (arr.equals(null) || arr.length == 1) {

			result = -1;
		} else if (neg > 0) {
			result = -2;
		} else {

			Arrays.sort(arr);
			int temp = arr[0];
			int sum = arr[0];
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == temp) {
					continue;
				} else {

					sum += arr[i];
				}
				temp = arr[i];
			}

			result = sum;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of the Array :");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + " Elements :");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();
		}
		System.out.println(sumOfArray(arr));
	}

}
