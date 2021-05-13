package assign11thMay;

import java.util.Scanner;

public class SingleDTwoArraysSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];

		System.out.println("Enter first Array Elements :");
		for (int i = 0; i < a.length; i++) {

			a[i] = scanner.nextInt();

		}
		System.out.println("Enter first Array Elements :");
		for (int i = 0; i < b.length; i++) {

			b[i] = scanner.nextInt();

		}
		int sum[]=addArrays(a, b);
		System.out.println("Sum of 2 Array elements :");
		for(int x:sum) {
			System.out.println(x);
		}

	}

	static int[] addArrays(int[] a, int[] b) {
		int sum[] = new int[5];
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				sum[i] = a[i] + b[i];
			}
		}

		return sum;

	}

}
