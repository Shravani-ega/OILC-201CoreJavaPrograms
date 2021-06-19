package arrays_Presentation;

import java.util.Scanner;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = { 10, 20, 30, 40 };
		int[] b = new int[4];

		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println(" ");
		for (int x : b) {
			System.out.print(x + " ");
		}
		b[0] = 11;
		b[1] = 22;
		System.out.println("\nEnter remaining 2 elements:");
		b[2] = s.nextInt();
		b[3] = s.nextInt();

		System.out.println(" ");
		for (int x : b) {
			System.out.print(x + " ");
		}
	}
}
