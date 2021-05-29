package newproj;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int college[][][] = new int[2][2][4];
		System.out.println("Enter College Info ");
		for (int i = 0; i < college.length; i++) {

			for (int j = 0; j < college[i].length; j++) {
				System.out.println("Enter " + (i + 1) + " Branch " + (j + 1) + " Student " + college[i][j].length
						+ " subject  marks");

				for (int k = 0; k < college[i][j].length; k++) {
					System.out.println("Enter " + (k + 1) + "  Subject Marks");

					college[i][j][k] = sc.nextInt();
				}
			}
		}
		dispCollege(college);
	}

	private static void dispCollege(int[][][] college) {
		System.out.println("College Information :");
		for (int i = 0; i < college.length; i++) {

			for (int j = 0; j < college[i].length; j++) {
				System.out.println((j+1) + " Student Marks ");
				for (int k = 0; k < college[i][j].length; k++) {

					System.out.print(college[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("*******************");
		}
	}
}