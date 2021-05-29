package constructors;

public class DemoConstructor2 {

	DemoConstructor2() {
		System.out.println("Default Constructor ");
	}

	DemoConstructor2(int num) {
		this();
		System.out.println("One Parameterized Constructor");
	}

	DemoConstructor2(int num1, int num2) {
		this(num1);
		System.out.println("Two Parameterized Constructor");
	}

	DemoConstructor2(int num1, int num2, int num3) {
		this(num1, num2);
		System.out.println("Three Parametrized Constructor");
	}

	public static void main(String[] args) {
		DemoConstructor2 demoConstructor2 = new DemoConstructor2(10, 20, 30);

	}

}
