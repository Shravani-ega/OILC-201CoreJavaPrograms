package arrayList_15thjune;

import java.util.ArrayList;
import java.util.List;

class Employee2 {

	int empNo;
	String ename;

	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + "]";
	}

	public Employee2(int empNo, String ename) {
		this.empNo = empNo;
		this.ename = ename;
	}
}

class Stud {

	int sNo;
	String sname;

	public Stud(int sNo, String sname) {

		this.sNo = sNo;
		this.sname = sname;
	}

	public String toString() {
		return sNo + " " + sname;
	}
}

public class ArrayListWithEmpStud {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("Size = " + list.size());
		list.add(10);
		Employee emp = new Employee(1, "Shravani");
		list.add(emp);
		

	}
}
