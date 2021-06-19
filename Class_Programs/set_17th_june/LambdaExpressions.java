package set_17th_june;

interface Calculate {
	public static void sub(int a, int b) {
		System.out.println("Substraction = " + (a - b));
	}

	void add(int a, int b);

	default void mul(int a, int b) {
		System.out.println("multiplication = " + (a * b));
	}

}

public class LambdaExpressions {

	public static void main(String[] args) {
		Calculate c = (a, b) -> System.out.println("Addition = " + (a + b));
		c.add(10, 20);
		Calculate.sub(30, 10);
		c.mul(2, 5);
	}

}
