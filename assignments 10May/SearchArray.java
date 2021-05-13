package assign10thMay;

import java.util.Scanner;

public class SearchArray {
	static void dispArray(int arr[]) {

		System.out.println("Array Elements are: ");

		for (int a : arr) {

			System.out.println(a);
		}

	}

	static String searchArr(int arr[], int key) {
		String result="";
		boolean b=false;
		for (int i = 0; i < arr.length; i++) {

			if (key == arr[i]) {

				b=true;			}
			
		}if(b) {
			
			result+=key+ " is found";
		}else {
			result+=" not found";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 10  Array  Elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scanner.nextInt();

		}

		dispArray(arr);
		System.out.println("Enter a Element to Search");
		System.out.println("Search Num is :" + searchArr(arr, scanner.nextInt()));

	}
}
