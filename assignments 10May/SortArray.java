package assign10thMay;

import java.util.Scanner;

public class SortArray {

	static void dispArray(int arr[]) {

		System.out.print("Array Elements are: ");

		for (int a : arr) {

			System.out.println(a);
		}

	}

	static String sortArray(int arr[]) {
		String result = "";
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				
			}
			result += arr[i] + " ";
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10  Array  Elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();

		}

		dispArray(arr);

		System.out.println("Numbers in Sorting order :" + sortArray(arr));

	}
}
