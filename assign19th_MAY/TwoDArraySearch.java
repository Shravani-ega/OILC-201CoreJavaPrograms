package assign19th_MAY;

import java.util.Scanner;

public class TwoDArraySearch {

	static boolean isElementExist(int[][] arr, int searchNum) {
		boolean result = false;

		if (arr.length == 0) {

			result = (Boolean) null;
		} else {
			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr[i].length; j++) {

					if (arr[i][j] == searchNum) {

						result = true;
					}
				}
			}
		}
		return result;
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
		System.out.println("Enter a number to Search :");
		int searchNum = scanner.nextInt();
		System.out.println(isElementExist(arr, searchNum));
	}

}
