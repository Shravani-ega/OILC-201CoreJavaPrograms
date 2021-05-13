package assign10thMay;

import java.util.Scanner;

public class ReverseArray {
	static void dispArray(int arr[]) {

		System.out.println("Array Elements are: ");

		for (int a : arr) {

			System.out.println(a);
		}

	}

	static String dispReverse(int arr[]) {
		
		String result="";
		System.out.println("Array in Reverse Order");

		for (int i = arr.length - 1; i >= 0; i--) {

		result+=arr[i]+" ";

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
		System.out.println(dispReverse(arr));

	}
}
