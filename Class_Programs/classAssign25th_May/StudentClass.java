package classAssign25th_May;

import java.util.Scanner;

public class StudentClass {

	int sno;
	String sname;
	int marks[] = new int[5];

	void accept(int sno, String name, int marks[]) {

		this.sno = sno;
		this.sname = name;
		this.marks = marks;
	}

	int totalMarks() {

		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		return sum;
	}

	void dispStudent() {

		System.out.println("SNO = " + sno);
		System.out.println("NAME = " + sname);
		System.out.println(findGrade());
	}

	boolean isPass() {

		boolean b = false;
		int count = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 35) {
				count++;
			}
		}
		if (count == marks.length) {
			b = true;
		}
		return b;
	}

	String findGrade() {
		String res = "";
		if (isPass()) {

			res += "You Passes \n";
			int tot = totalMarks();
			res += "Total Marks=" + tot + "\n";
			int avg = tot / marks.length;
			res += "Average Marks= " + avg + "\n";
			if (avg >= 75) {
				res += "You got distinction \n";
			} else if (avg >= 60) {

				res += "You got first class \n";

			} else if (avg >= 50) {
				res += "You got Second class \n";
			} else {
				res += "You got Third class \n";
			}

		} else {
			res = "Try again";
		}

		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your no, sname, 5 sub marks :");
		StudentClass obj = new StudentClass();
		int sno = sc.nextInt();
		String name = sc.next();
		int marks[] = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		obj.accept(sno, name, marks);
		obj.dispStudent();
	}

}
