package constructors;

import java.util.Scanner;

public class StudentArray {

	int sno;
	String name;
	int arr[] = new int[5];
	StudentArray stud[];

	StudentArray(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	void display() {
		System.out.println("Stud No = " + sno);
		System.out.println("Name = " + name);
	}

	public static void main(String[] args) {

		StudentArray studs[] = new StudentArray[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < studs.length; i++) {

			System.out.println("Enter " + (i + 1) + " Student no, name ?");
			studs[i] = new StudentArray(sc.nextInt(), sc.next());

		}

		System.out.println("Students Information :");
		for (int i = 0; i < studs.length; i++) {
			studs[i].display();
		}
	}
}
