package constructors;

public class Student {

	int studNo;
	static String studName;

	Student() {
		System.out.println("Default Constructor");
	}

	Student(int studNo, String studName) {
		this();
		this.studNo = studNo;
		this.studName = studName;
		System.out.println("Two Parameterized Constructor");
	}

	void display() {
		System.out.println("Stud No = " + studNo);
		System.out.println("Name = " + studName);
	}

	public static void main(String[] args) {
		Student studObj1 = new Student(101, "Shravani");
		studObj1.display();

		Student studObj2 = new Student(102, "koushik Raj");
		studObj2.display();
	}

}
