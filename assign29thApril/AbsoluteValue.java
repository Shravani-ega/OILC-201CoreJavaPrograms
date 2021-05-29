package assign29thApril;

public class AbsoluteValue {

	public static void main(String[] args) {
		try {

			int num = Integer.parseInt(args[0]);

			if (num < 0) {
				num = -(num);
			}
			System.out.println("Absolute Value of given number is : " + num);

		} catch (NumberFormatException e) {
			System.out.println("Please enter integer value.");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Please Enter only one value.");
		}
	}
}
