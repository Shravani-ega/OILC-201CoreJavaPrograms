package class_7th_june;

public class NestedTry {

	public static void main(String[] args) {
		try {

			int a = args.length;
			int b = 23 / a;
			System.out.println("a = " + a);
			try {

				if (a == 1) {
					a = a / (a - a);
				}
				if (a == 2) {
					int c[] = { 1 };
					c[45] = 99;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index  " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("Divided by Exception " + e);
		}
	}

}
