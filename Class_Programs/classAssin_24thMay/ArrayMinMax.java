package classAssin_24thMay;

import java.util.Scanner;

public class ArrayMinMax {

	static void dispArray(int arr[]) {

		System.out.println("Array Elements are: ");

		for (int x : arr) {

			System.out.print(x + " ");
		}
	}

	static int max(int[] array) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	static int min(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the array :");

		int arraySize = sc.nextInt();
		int arr[] = new int[arraySize];

		System.out.println("Enter " + arraySize + " Elements :");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		dispArray(arr);
		System.out.println("\nMinimum Value :" + min(arr));
		System.out.println("Maximum value :" + max(arr));

	}

}
