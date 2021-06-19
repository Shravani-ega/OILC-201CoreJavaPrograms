package assign_16th_june;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Empl implements Comparable {
	private int empno;
	private String ename;
	private double salary;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Empl(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		Empl e = (Empl) arg0;
		return this.empno - e.empno;
		// return this.ename.compareTo(e.ename);
	}
}

public class EmployeeDataSorting {

	public static void main(String[] args) {
		List<Empl> list = new ArrayList<Empl>();
		Empl e1 = new Empl(10, "Ameer", 60000);
		Empl e2 = new Empl(8, "Shravani", 50000);
		Empl e3 = new Empl(2, "Zaheera", 40000);
		Empl e4 = new Empl(6, "Nirmala", 60000);
		Empl e5 = new Empl(19, "Koushik", 80000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println("Before Sorting------- :");
		list.forEach(e -> System.out.println(e));
		Collections.sort(list);
		System.out.println("After Sorting");
		list.forEach(e -> System.out.println(e));
	}

}
