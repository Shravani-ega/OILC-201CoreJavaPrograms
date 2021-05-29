package string;

public class StringReverse {

	public static void main(String[] args) {

		String input = "Welcome to Java";
		input = input.toLowerCase();
		String[] values = input.split(" ");
		String res = "";

		for (String x : values) {
			StringBuffer sb = new StringBuffer(x);
			String odj = sb.reverse().toString();
			res += odj.substring(0, 1).toUpperCase() + odj.substring(1) + " ";
		}
		System.out.println(res);

	}

}
