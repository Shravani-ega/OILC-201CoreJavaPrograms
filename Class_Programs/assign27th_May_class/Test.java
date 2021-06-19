package assign27th_May_class;

import java.util.Scanner;

class Employee {
	private int eno;
	private String name;
	private double salary;

	public void setEno(int eno) {
		this.eno = eno;
	}

	public int getEno() {
		return eno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
}

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no, name,salary ");
		Employee employee = new Employee();
		employee.setEno(sc.nextInt());
		employee.setName(sc.next());
		employee.setSalary(sc.nextDouble());

		System.out.println("No : " + employee.getEno());
		System.out.println("Name : " + employee.getName());
		System.out.println("Salary : " + employee.getSalary());
	}
}
