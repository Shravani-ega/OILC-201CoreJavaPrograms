package assign19thApril;

class SumFinder {
	public static void sumFind(String str1, String str2, String str3) {
		try {
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			int num3 = Integer.parseInt(str3);

			if (num1 > 0 && num2 > 0 && num3 > 0) {
				int res1 = ((num1 / 10) + 1) * 10;

				int res2 = ((num2 / 10) + 1) * 10;

				int res3 = ((num3 / 10) + 1) * 10;

				int Result = res1 + res2 + res3;

				System.out.println("Sum of the Rounded values: " + Result);

			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}

public class Sum {

	public static void main(String[] args) {

		SumFinder.sumFind(args[0], args[1], args[2]);

	}

}
