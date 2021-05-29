package assign11thMay;

import java.util.Scanner;

public class StudentResultsArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int marks[] = new int[5];

		System.out.println("Enter 5 Subject Marks :");

		for (int i = 0; i < marks.length; i++) {

			marks[i] = scanner.nextInt();

		}
		dispMarks(marks);
		System.out.println("Result :"+dispResult(marks));
	}

	static String dispResult(int[] marks) {

		String result = "";

		if (isPass(marks)) {

			result += "Total Marks = " + calTotal(marks) + "\n";
			result += "Average marks= " + calAverage(marks) + "\n";
			result += "Grade of the Student= " + findGrade(marks);

		} else {
			result += "Failed";
		}
		return result;
	}

	static String findGrade(int[] marks) {
		String result = "";

		int ave = calAverage(marks);
		if (ave >= 75) {

			result += " A Grade";

		} else if (ave > 60 && ave < 75) {

			result += " B Grade";
		} else {
			result += " C Grade";
		}

		return result;
	}

	static int calAverage(int[] marks) {

		return calTotal(marks) / 5;

	}

	static int calTotal(int[] marks) {
		int sum = 0;

		for (int x : marks) {

			sum = sum + x;

		}
		return sum;
	}

	static void dispMarks(int[] marks) {
		System.out.println("Student Marks :");
		for (int x : marks) {

			System.out.println(x);
		}
	}

	static boolean isPass(int[] marks) {
		boolean b = false;
		String str = "";

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] >= 35) {

				str += "true";
			}
		}
		if (str.equalsIgnoreCase("truetruetruetruetrue")) {
			b = true;
		}
		return b;
	}
}
