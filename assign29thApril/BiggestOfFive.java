package assign29thApril;

public class BiggestOfFive {

	public static void main(String[] args) {
		if (args.length != 5) {
			System.out.println("Please Enter 5 Values only");
		}
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if (num1 < num2) {
				num1 = num2;
			}
			num2 = Integer.parseInt(args[2]);
			if (num1 < num2) {
				num1 = num2;
			}

			num2 = Integer.parseInt(args[3]);
			if (num1 < num2) {
				num1 = num2;
			}
			num2 = Integer.parseInt(args[4]);
			if (num1 < num2) {
				num1 = num2;
			}
			System.out.println("Biggest of given 5 numbers is : " + num1);

		} catch (Exception e) {
			System.err.println("Please Enter valid input values");
		}
	}

}
