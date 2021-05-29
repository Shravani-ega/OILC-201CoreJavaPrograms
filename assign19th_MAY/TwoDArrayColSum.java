package assign19th_MAY;

import java.util.Scanner;

public class TwoDArrayColSum {

	static int[] getColumnSum(int[][] arr) {
		int[] sum = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int add = 0;
			if (arr[i].length == 3 && arr.length == 3) {
				for (int j = 0; j < arr[i].length; j++) {

					add = add + arr[j][i];
				}
				sum[i] = add;
			} else {
				return null;
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		try {
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
			int[] rowSum = getColumnSum(arr);

			for (int x : rowSum) {
				System.out.print(x + " ");
			}
		} catch (Exception e) {
			System.out.println("Null");

		}
	}

}
