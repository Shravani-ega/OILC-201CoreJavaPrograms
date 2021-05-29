package assign28thApril;

public class Wish {

	public static void main(String[] args) {
		String result = null;

		if (args[0].equalsIgnoreCase("am"))
			result = "Good Morning " + args[1];

		else if (args[0].equalsIgnoreCase("pm")) {
			result = "Good Evening " + args[1];

		} else {
			result = "First Argument should be eighter \"AM\" or \"PM\" ";
		}

		System.out.println(result);
	}
}
