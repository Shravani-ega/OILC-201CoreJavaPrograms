package assign11thMay;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {

	public static int[] addElement(int[] arr, int element, int position) {

		int temp[] = new int[arr.length + 1];

		for (int i = 0, j = 0; i < temp.length; i++) {
			if (i == position) {
				temp[i] = element;
			} else {
				temp[i] = arr[j++];
			}
		}

		return temp;
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int arr[] = { 10, 20, 30, 40, 50 };
		
		System.out.println("Enter A Element to add into the array");

		int element = scanner.nextInt();
		System.out.println("Enter position of the Element "+element);
		int position = scanner.nextInt();

		System.out.println("Original array: " + Arrays.toString(arr));

		arr = addElement(arr, element, position);

		System.out.println("New array: " + Arrays.toString(arr));
		scanner.close();
	}
}