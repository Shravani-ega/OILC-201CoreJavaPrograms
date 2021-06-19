package set_17th_june;

@FunctionalInterface
interface Calculator3 {
	void sum(int a, int b);

}

public class ConstructorReferenceDemo {
	public ConstructorReferenceDemo(int a, int b) {
		System.out.println("Sum =" + (a + b));
	}

	void saySum(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}

	public static void main(String[] args) {

		Calculator3 c = ConstructorReferenceDemo::new;
		c.sum(10, 40);
	}
}