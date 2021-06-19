package predicate_18th_june;

import java.util.ArrayList;
import java.util.function.Consumer;

class Student1 {

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

	public Student1(int sno, String name, String course) {
		this.sno = sno;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", course=" + course + "]";
	}

}

public class ConsumerDisplayStud {

	public static void main(String[] args) {

		ArrayList<Student1> list = new ArrayList<Student1>();
		Student1 s1 = new Student1(1, "Shravani", "Java");
		Student1 s2 = new Student1(2, "Ameer", "Java");
		Student1 s3 = new Student1(3, "Kiranmayi", "Testing");
		Student1 s4 = new Student1(4, "Sai", "Python");
		Student1 s5 = new Student1(4, "Swetha", "Python");
		Student1 s6 = new Student1(12, "Kiran", "Testing");
		Student1 s7 = new Student1(9, "Raj", ".net");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);

		Consumer<Student1> studs = s -> System.out.println(s.getSno() + " " + s.getName());
		for (Student1 st : list) {
			studs.accept(st);
		}
	}
}
