package class_7th_june;

public class Multiple {

	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a =" + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index " + e);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException " + e);
		} catch (Exception e) {
			System.out.println("Exception");

		}
	}

}
