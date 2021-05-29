package constructors;

public class DemoConstructor {

	DemoConstructor() {
		System.out.println("Default Constructor ");
	}

	DemoConstructor(int num) {
		System.out.println("One Parameterized Constructor");
		;
	}

	DemoConstructor(int num1, int num2) {
		System.out.println("Two Parameterized Constructor");
	}

	DemoConstructor(int num1, int num2, int num3) {
		System.out.println("Three Parametrized Constructor");
	}

	public static void main(String[] args) {
		DemoConstructor dc = new DemoConstructor();
		DemoConstructor dc2 = new DemoConstructor(10);

	}

}
