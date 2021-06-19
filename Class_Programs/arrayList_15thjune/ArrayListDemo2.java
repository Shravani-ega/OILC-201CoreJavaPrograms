package arrayList_15thjune;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {

	private int empNo;
	private String ename;

	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + "]";
	}

	public Employee(int empNo, String ename) {
		this.empNo = empNo;
		this.ename = ename;
	}
}

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println("Size = " + list.size());
		list.add(10);
		list.add(45.6f);
		list.add("Hello ");
		list.add(false);
		list.add(0, 45);
		list.add(10);
		list.add(null);
		list.add(null);
		Employee emp = new Employee(1, "Shravani");
		list.add(emp);
		list.remove(null);
		list.set(6, "Ojas");
		System.out.println("After adding the size =" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("By using For-each loop");
		for (Object x : list) {
			System.out.println(x);
		}
		System.out.println("By using Iterator");
		Iterator i = list.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
	}
}
