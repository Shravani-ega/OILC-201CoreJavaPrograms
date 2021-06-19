package assign14_May;

import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;

		System.out.println("Enter a number to Search :");
		int result = binarySearch(arr, 0, n - 1, scanner.nextInt());
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}