package set_17th_june;

@FunctionalInterface
interface Calculator {
	void sum(int a, int b);

}

public class MethodReference {

	static void saySum(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}

	public static void main(String[] args) {
		Calculator ref = MethodReference::saySum;
		ref.sum(10, 20);
	}

}
