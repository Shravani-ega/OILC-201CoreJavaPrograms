package set_17th_june;

@FunctionalInterface
interface Calculator2 {
	void sum(int a, int b);

}

public class MethodReference2 {

	void saySum(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}

	public static void main(String[] args) {

		MethodReference2 obj = new MethodReference2();
		Calculator2 c = obj::saySum;
		c.sum(10, 20);
	}

}