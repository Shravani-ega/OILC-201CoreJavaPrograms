package classAssin_24thMay;

import java.util.Scanner;

public class EvenNumbersInRange {
	static int[] findEvenNumbers(int startNum, int endNum) {
		int size = (endNum - startNum) / 2;

		int arr[] = new int[size + 1];
		int index = 0;
		for (int i = startNum; i <= endNum; i++) {

			if (i % 2 == 0) {

				arr[index] = i;
			} else {

				index++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");

		int[] evenNumbers = findEvenNumbers(scanner.nextInt(), scanner.nextInt());

		for (int x : evenNumbers) {

			System.out.print(x + " ");
		}
	}

}
