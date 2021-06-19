package arrayList_15thjune;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employe {

	private int empNo;
	private String ename;
	private double salary;

	public Employe(int empNo, String ename, double salary) {
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

class ListOperations {

	List<Employe> empList;

	ListOperations() {
		empList = new ArrayList<Employe>();
	}

	void menu() {
		String menu = "Menu Driven Application :\n";
		menu += "1. Add Employee \n";
		menu += "2. Delete Employee \n";
		menu += "3. Update Employee \n";
		menu += "4. Display Employee \n";
		menu += "5. Add at specific loc \n";
		menu += "6. Exit \n";
		menu += "Select any option? \n";
		System.out.println(menu);
	}

	void addEmployee(Employe emp) {
		empList.add(emp);
		System.out.println("Your info is added Successfully");
	}

	void insertAt(int ind, Employe emp) {

		empList.add(ind, emp);
		System.out.println("Added at Specified location");
	}

	void deleteEmployee(int ind) {
		empList.remove(--ind);
		System.out.println("Deleted Successfully");
	}

	void updateEmployee(int ind, Employe emp) {
		empList.set(--ind, emp);
		System.out.println("updated Successfully");
	}

	void listEmployees() {

		System.out.println("Employee Info");
		for (Employe e : empList) {
			System.out.println(e);
		}
	}

	void accept() {
		System.out.println("Enter your no,name,salary");
	}
}

public class CurdOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListOperations obj = new ListOperations();
		for (;;) {

			obj.menu();
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				obj.accept();
				obj.addEmployee(new Employe(sc.nextInt(), sc.next(), sc.nextDouble()));
				break;
			case 2:
				System.out.println("Enter empno ?");
				obj.deleteEmployee(sc.nextInt());
				break;
			case 3:
				obj.accept();
				int empNo = sc.nextInt();
				obj.updateEmployee(empNo, new Employe(sc.nextInt(), sc.next(), sc.nextDouble()));
				break;
			case 4:
				obj.listEmployees();
				break;
			case 5:
				System.out.println("Enter index ");
				obj.insertAt(sc.nextInt(), new Employe(sc.nextInt(), sc.next(), sc.nextDouble()));
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
		}
	}
}