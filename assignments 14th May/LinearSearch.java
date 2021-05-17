package assign14thMay;

import java.util.Scanner;

public class LinearSearch {
	static String linearSearch(int arr[], int key) {
		String result = "";

		for (int i = 0; i < arr.length; i++) {

			if (key == arr[i]) {

				result += key + "  found at " + (i+1 )+ " location";
				break;
			} 
		}
		
		return result;
	}

	static void dispArray(int arr[]) {

		System.out.println("Array Elements are: ");

		for (int a : arr) {

			System.out.println(a);
		}
	}

	public static void main(String a[]) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.println("Enter 5  Array  Elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();
		}
		dispArray(arr);
		System.out.println("Enter a Element to Search");
		System.out.println("Search Num is :" + linearSearch(arr, scanner.nextInt()));
	}
}