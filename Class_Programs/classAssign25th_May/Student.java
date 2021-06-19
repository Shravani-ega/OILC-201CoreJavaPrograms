package classAssign25th_May;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	static Scanner scanner = new Scanner(System.in);

	static int sno;
	static String name;
	static int[] marks = new int[5];

	static void accept() {

		System.out.println("Enter Student Number :");
		sno = scanner.nextInt();
		System.out.println("Enter Student Name :");
		name = scanner.next();
		System.out.println("Enter Student Marks :");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter " + (i + 1) + " Subject marks :");
			marks[i] = scanner.nextInt();

		}
	}

	static void display() {

		System.out.println("Student Number :" + sno);
		System.out.println("Student Name :" + name);
		System.out.println("Student marks :" + Arrays.toString(marks));
	}

	static String findGrade(int marks[]) {
		String result = "";
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}
		if (total > 400) {

			result += "A Grade ";
		} else if (total > 300 && total < 400) {

			result += "B Grade ";

		} else {
			result += "C Grade ";
		}

		return result;
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.accept();
		student.display();
		System.out.println("Grade :" + student.findGrade(marks));
	}
}
