package class_11th_june;

import java.io.Serializable;

public class Student implements Serializable {
	private int sno;
	private String sname;
	private transient int age;

	public Student(int sno, String sname, int age) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
	public int getSno() {
		return sno;
	}
	public String getSname() {
		return sname;
	}
	public int getAge() {
		return age;
	}
}
