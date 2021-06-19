package class_7th_june;

public class NumberFormat {

	public static void main(String[] args) {
		System.out.println("Enter 2 values");
		try {

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a + b);

		} catch (Exception e) {
			System.out.println("Please Enter Integers only " + e);
		}
	}
}
