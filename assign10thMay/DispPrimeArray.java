package assign10thMay;

import java.util.Scanner;

public class DispPrimeArray {
	static void dispArray(int arr[]) {

		System.out.println("Array Elements are: ");

		for (int a : arr) {

			System.out.println(a);
		}

	}

	static String primeArray(int ar[]) {

		String result = "";
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 1; j < ar[i]; j++) {

				if ((ar[i] % j) == 0) {
					
					count++;
				}

			}
			if (count == 1) {
				result += ar[i] + " ";
			}
			count=0;
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

		System.out.println("prime numbers in the Array is :" + primeArray(arr));

	}

}
