package newproj;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int studs[][] = new int[3][0];
		studs[0] = new int[3];
		studs[1] = new int[2];
		studs[2] = new int[1];
		System.out.println("Enter 3 Student Marks :");

		for (int i = 0; i < studs.length; i++) {
			System.out.println("Enter " + (i + 1) + " Student " + studs[i].length + " marks ");

			for (int j = 0; j < studs[i].length; j++) {
				studs[i][j] = scanner.nextInt();
			}
		}
		displayStud(studs);
	}

	static void displayStud(int[][] studs) {
		System.out.println("Students Information :");
		for (int i = 0; i < studs.length; i++) {

			System.out.println(i + 1 + " Student marks ::");
			for (int j = 0; j < studs[i].length; j++) {
				System.out.print(studs[i][j] + " ");
			}
			System.out.println();
		}
	}
}
