package set_17th_june;

import java.util.HashSet;
import java.util.Iterator;

class Employy {
	private int empNo;
	private String ename;
	private double salary;

	public int getEmpNo() {
		return empNo;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	public Employy(int empNo, String ename, double salary) {
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	public String toString() {
		return "Empl [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

public class EmpHasSet {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		Employy e1 = new Employy(1, "Shravani", 80000);
		Employy e2 = new Employy(8, "Ammer", 60000);
		Employy e3 = new Employy(9, "Nirmala", 400000);
		Employy e4 = new Employy(56, "Sai", 900000);
		Employy e5 = new Employy(1, "Shravani", 100000);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e5);
		Iterator<Object> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
