package assign17_MAY;

import java.util.Scanner;

public class FindMaximum {

	static int findMax(int arr[]) {
		int result = 0;
		int neg = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= 0) {
				neg++;
			}
		}
		if (neg < 3) {

			result = -1;
		} else if (arr.equals(null)) {
			result = 0;
		} else {
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						arr[i] = temp;
						arr[i] = arr[j];
						temp = arr[j];
					}
				}
			}
			result = temp;
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
		System.out.println(findMax(arr));
	}

}
