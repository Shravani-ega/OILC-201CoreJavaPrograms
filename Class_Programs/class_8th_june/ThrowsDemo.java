package class_8th_june;

public class ThrowsDemo {

	public static void main(String[] args) {

		int balance = 1000, withdraw = 15000;
		try {
			if (balance < withdraw) {
				throw new ArithmeticException("No sufficient Balance");

			} else {
				System.out.println("Draw and Enjoy");
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
