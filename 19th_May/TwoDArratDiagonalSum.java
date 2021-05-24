package assign19th_MAY;

import java.util.Scanner;

public class TwoDArratDiagonalSum {

	static int getDiagonalSum(int[][] arr) {
		int result = 0;
		int add = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].length == 3 && arr.length == 3) {
				for (int j = 0; j < arr[i].length; j++) {
					if (i == j) {
						add = add + arr[i][j];
					}
				}
			} else {
				return -1;
			}
			result = add;
		}
		return result;

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
			System.out.println(getDiagonalSum(arr));

		} catch (Exception e) {
			System.out.println("Null");

		}
	}

}
