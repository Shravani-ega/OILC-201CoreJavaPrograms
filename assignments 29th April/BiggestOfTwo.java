package assign29thApril;

public class BiggestOfTwo {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			int num = 0;

			if (num1 > num2) {
				num = num1;
			} else {
				num = num2;
			}
			System.out.println("Biggest among " + num1 + " and " + num2 + " is " + num);
		} catch (Exception e) {
			System.out.println("Please enter  valid input");
		}
	}
}
