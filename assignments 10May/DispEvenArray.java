package assign10thMay;

import java.util.Scanner;

public class DispEvenArray {
	static void dispArray(int arr[]) {

		System.out.println("Array Elements are: ");

		for (int a : arr) {

			System.out.println(a);
		}

	}

	static String findEvenNums(int ar[]) {

		String result = "";
		for (int i = 0; i < ar.length; i++) {

			if ((ar[i] % 2) == 0) {
				result += ar[i] + " ";

			}
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
		System.out.println("Even numbers in the Array are :" + findEvenNums(arr));

	}

}
