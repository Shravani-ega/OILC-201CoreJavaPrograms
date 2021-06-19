package arrayList_15thjune;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Emp {
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

	public Emp(int empno, String ename, double salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

public class EmployeeData {

	public static void main(String[] args) throws Exception {
		List<Emp> empList = new ArrayList<Emp>();
		FileReader fr = new FileReader(
				"C:\\Users\\se21222\\eclipse-workspace\\classPrograms\\src\\arrayList_15thjune\\empdata");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while ((line = br.readLine()) != null) {
			String str[] = line.split(",");
			Emp e = new Emp(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			empList.add(e);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp no ?");
		int empNo = sc.nextInt();
		boolean b = false;
		for (Emp e : empList) {
			if (e.getEmpno() == empNo) {
				System.out.println(e.getEname() + " " + e.getSalary());
				b = true;
			}
		}
		if (!b) {
			System.out.println("Not Found");
		}
	}
}
