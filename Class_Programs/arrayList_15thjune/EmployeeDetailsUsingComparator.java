package arrayList_15thjune;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employ {
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

	public Employ(int empNo, String ename, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empl [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
// TODO Auto-generated method stub
		Employ e1 = (Employ) arg0;
		Employ e2 = (Employ) arg1;
		return e1.getEmpNo() - e2.getEmpNo();
	}
}

public class EmployeeDetailsUsingComparator {
	public static void main(String[] args) throws Exception {
		List<Employ> list = new ArrayList<Employ>();
		Employ e1 = new Employ(89, "Ameer", 25000);
		Employ e2 = new Employ(22, "Shravani", 25000);
		Employ e3 = new Employ(15, "Nirmala", 25000);
		Employ e4 = new Employ(55, "Sai", 25000);
		Employ e5 = new Employ(19, "Sudheer", 25000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println("Before Sorting");
		list.forEach(e -> System.out.println(e));
		Collections.sort(list, new MyComparator());
		System.out.println("After Sorting");
		list.forEach(e -> System.out.println(e));
	}
}