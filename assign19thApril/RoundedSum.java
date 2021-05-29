package assign19thApril;

public class RoundedSum {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);

			if (a >= 0 && b >= 0 && c >= 0) {
				System.out.println(round(a) + round(b) + round(c));

			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static int round(int n) {
		int num = 0;
		if (n % 10 >= 5) {
			num = ((n / 10) + 1) * 10;
		} else {

			num = (n / 10) * 10;
		}
		return  num;
	}

}