package class_10th_june;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {

	private int empNo;
	private String name;
	private double salary;

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(int empNo, String name, double salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class EmpDemo {

	public static void main(String[] args) {
		Path path = Paths.get("E://Employee.txt");
		List<Employee> list = new ArrayList<Employee>();
		try {

			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				String str[] = line.split(",");
				Employee e = new Employee(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
				list.add(e);
			}
		} catch (Exception e) {
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee number");
		int empno = sc.nextInt();
		for (Employee e : list) {

			if (e.getEmpNo() == empno) {
				System.out.println(e);
			}
		}

	}
}
