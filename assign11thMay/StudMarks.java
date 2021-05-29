package assign11thMay;

import java.util.Scanner;

public class StudMarks {

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
		
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {

				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
