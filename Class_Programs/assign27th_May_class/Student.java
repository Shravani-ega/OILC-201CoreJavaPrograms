package assign27th_May_class;

import java.util.Scanner;

public class Student {

	public int studentId;
	public String studentName;
	private char grade;
	private int marks;

	Student() {
		System.out.println("Student Information ");
	}

	Student(int studentId, String studentName, int marks) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculateGrade();
	}

	private void calculateGrade() {

		if (marks > 90) {
			grade = 'A';
		} else if (marks < 90 && marks > 80) {
			grade = 'B';
		} else if (marks < 80 && marks > 70) {
			grade = 'c';
		} else if (marks < 70 && marks > 60) {
			grade = 'D';
		} else {
			grade = 'E';
		}

	}

	public String displayDetails() {
		return "Student[name=" + studentName + " , studentId=" + studentId + ", marks= " + marks + ", grade=" + grade
				+ "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id :");
		int id = sc.nextInt();
		System.out.println("Enter Student name :");
		String name = sc.next();
		System.out.println("Enter Student Marks :");
		int marks = sc.nextInt();

		Student student = new Student(id, name, marks);

		System.out.println(student.displayDetails());

	}

}
