package newproj;

public class Wish {

	public static void main(String[] args) {

		if (args[0].equalsIgnoreCase("am")) {
			System.out.println("Good Morning " + args[1]);

		} else if (args[0].equalsIgnoreCase("pm")) {
			System.out.println("Good Evening " + args[1]);

		} else {
			System.out.println("First Argument should be eighter \"AM\" or \"PM\" ");
		}
	}
}
