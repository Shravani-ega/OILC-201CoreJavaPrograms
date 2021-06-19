package class_28th_May;

public class StaticDemo {

	static int num;
	int num1;

	public static void main(String[] args) {
		System.out.println("static Direct call " + num);
		// System.out.println(num1);----error

		System.out.println("Static with calss name" + StaticDemo.num);
		// System.out.println(StaticDemo.num1);---error

		StaticDemo obj = new StaticDemo();
		System.out.println("static with obj " + obj.num);

		System.out.println("non-static with obj " + obj.num1);// with an object

	}

}
