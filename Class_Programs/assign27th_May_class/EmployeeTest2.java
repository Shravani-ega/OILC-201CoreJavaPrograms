package assign27th_May_class;

import java.util.Scanner;

class Employee2 {
	private int eno;
	private String name;
	private double salary;

	public Employee2(int eno, String name, double salary) {
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	public int hashCode() {
		return eno;
	}

	public boolean equals(Object obj) {
		Employee2 e = (Employee2) obj;

		return this.eno == e.eno && this.name.equals(e.name) && this.salary == e.salary;
	}

	public String toString() {
		return eno + " " + name + " " + salary;
	}
}

public class EmployeeTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no, name,salary ");
		Employee2 employee2 = new Employee2(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println(employee2);

		Employee2 obj = new Employee2(10, "Ramu", 30000);

		Employee2 obj1 = new Employee2(11, "Nirmala", 30000);

		Employee2 obj2 = new Employee2(11, "Nirmala", 30000);

		System.out.println(obj1 == obj2);

		System.out.println(obj1.equals(obj2));

	}

}
