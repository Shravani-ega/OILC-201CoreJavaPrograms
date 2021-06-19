package classAssin_24thMay;

import java.util.Scanner;

public class SumOfRightDaigonalElements {

	static int getDiagonalSum(int[][] arr) {

		int add = 0;
		int count = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = (arr[i].length) - 1 - i; j >= count; j--) {

				add = add + arr[i][j];
			}
			count--;
		}
		return add;
	}

	static void displayArray(int[][] array) {

		System.out.println("-----Array Elements are------");
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter row Size :");
		int row = scanner.nextInt();
		System.out.println("Enter column Size :");
		int col = scanner.nextInt();

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			System.out.println("Enter " + (i + 1) + " row Elements ");

			for (int j = 0; j < col; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		displayArray(arr);
		System.out.println("Sum of DiagonalElements :" + getDiagonalSum(arr));

	}
}
