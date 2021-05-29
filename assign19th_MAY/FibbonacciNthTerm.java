package assign19th_MAY;

import java.util.Scanner;

public class FibbonacciNthTerm {
	static int getNthTermFibbonacciSeries(int num) {
		int result = 0;
		if (num <= 0) {
			result = -1;
		} else {

			int[] arr = new int[num];
			int sum = 0;
			int n1 = 0, n2 = 1;

			for (int i = 2; i < num; i++) {
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
				arr[i] = sum;

			}
			result = arr[num-1];
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		System.out.println(getNthTermFibbonacciSeries(scanner.nextInt()));
	}

}
