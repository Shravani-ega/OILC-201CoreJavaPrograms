package assign17_MAY;

import java.util.Scanner;

public class OccuranceCounter {

	static int getCount(int arr[], int num) {
		int result = 0;
		if (arr.length == 0 || arr.equals(null)) {

			result = -1;

		}
		else {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == num) {

					count++;
				}
			}
			result = count;
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
		System.out.println("Enter a value to Count :");
		System.out.println(getCount(arr, scanner.nextInt()));
	}

}
