package assign11thMay;

import java.util.Scanner;

public class StudMarksSum {

	static void dispStudMarks(int[][] marks) {
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {

				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int marks[][] = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Students Marks");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter " + (i + 1) + " Student Marks");
			for (int j = 0; j < marks[i].length; j++) {

				marks[i][j] = scanner.nextInt();
			}
		}
		dispStudMarks(marks);
		int res[] = dispMarksSum(marks);
		for (int x : res) {

			System.out.println("sum of marks of stud  = "+x);
		}
	}

	static int[] dispMarksSum(int[][] marks) {

		int result[] = new int[marks.length];

		System.out.println("3 students 3 subject marks");
		for (int i = 0; i < marks.length; i++) {

			int sum = 0;
			for (int j = 0; j < marks[i].length; j++) {

				sum = sum + marks[i][j];

			}
			result[i] = sum;
			System.out.println();
		}

		return result;

	}

}
