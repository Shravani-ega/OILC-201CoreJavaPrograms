package predicate_18th_june;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {

	private int sno;
	private String name;
	private String course;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(int sno, String name, String course) {
		super();
		this.sno = sno;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", course=" + course + "]";
	}

}

public class StudentListUsingPredicate {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "Shravani", "Java");
		Student s2 = new Student(2, "Ameer", "Java");
		Student s3 = new Student(3, "Kiranmayi", "Testing");
		Student s4 = new Student(4, "Sai", "Python");
		Student s5 = new Student(4, "Swetha", "Python");
		Student s6 = new Student(12, "Kiran", "Testing");
		Student s7 = new Student(9, "Raj", ".net");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);

		Predicate<Student> javaStudent = (Student s) -> s.getCourse().equals("Java");
		System.out.println("java Students :");
		m1(javaStudent, list);
	}

	public static void m1(Predicate<Student> javaStudent, ArrayList<Student> list) {
		for (Student m : list) {
			if (javaStudent.test(m)) {
				System.out.println(m);
			}
		}
	}
}
