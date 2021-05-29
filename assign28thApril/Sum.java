package assign28thApril;

public class Sum {

	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("Invalid Argument Please \nenter 4 values");
			return;
		}

		try {

			int sum = Integer.parseInt(args[0]);
			int next = Integer.parseInt(args[1]);

			sum = sum + next;
			next = Integer.parseInt(args[2]);
			sum = sum + next;
			next = Integer.parseInt(args[3]);
			sum = sum + next;

			System.out.println(sum);

		} catch (NumberFormatException e) {
			System.out.println("Please enter numbers only");
		}
	}
}
