package classAssign25th_May;

import java.util.Scanner;

class Employee {

	int empNo;
	String ename;
	double salary;

	void accept(int empNo, String ename, double salary) {

		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	void dispStudent() {
		System.out.println("Test Details ");
		System.out.println("EMPNO  = " + empNo);
		System.out.println("ENAME  = " + ename);
		System.out.println("SALARY = " + salary);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Test Number :");
		int empNo = scanner.nextInt();
		System.out.println("Enter Test Name :");
		String ename = scanner.next();
		System.out.println("Enter Salary :");
		double salary = scanner.nextDouble();

		Employee emp = new Employee();

		emp.accept(empNo, ename, salary);
		emp.dispStudent();
	}
}
