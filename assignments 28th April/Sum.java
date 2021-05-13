package newproj;

public class Sum {

	public static void main(String[] args) {
		try {

			int a = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			int b = Integer.parseInt(args[2]) + Integer.parseInt(args[3]);

			System.out.println(a + b);

			// System.out.println(Integer.parseInt(args[0]) +
			// Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3]));
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
