package assign14thMay;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values");
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {

			a[i] = scanner.nextInt();
		}
		dispElementsInArray(a);
		sortAnArray(a);
	}

	static void dispElementsInArray(int[] a) {
		System.out.println("Array Elements As Follows :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void sortAnArray(int[] a) {
		int temp;
		System.out.println("\nAfter Sorting using Selectio Sort :");
		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		dispElementsInArray(a);
	}
}
