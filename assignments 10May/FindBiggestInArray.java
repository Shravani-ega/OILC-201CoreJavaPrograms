package assign10thMay;

import java.util.Scanner;

public class FindBiggestInArray {

	static void dispArray(int arr[]) {

		System.out.println("Array Elements are: ");

		for (int a : arr) {

			System.out.println(a);
		}
	}

	static int findBiggest(int arr[]) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		return arr[arr.length-1];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10  Array  Elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();

		}
		dispArray(arr);
		int bigg=findBiggest(arr);
		System.out.println("Biggest number in the Array is :"+ bigg);

	}

}
