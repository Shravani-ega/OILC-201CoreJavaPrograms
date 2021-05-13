package assign19thApril;

class LeastNum {
	public static void smallNum(String str1, String str2) {
		try {
			int num1 = Integer.parseInt(str1);

			int num2 = Integer.parseInt(str2);

			if (num1 < num2) {
				System.out.println(num1 + " is the Least Number");

			} else {
				System.out.println(num2 + " is the Least Number");
			}
		}

		catch (Exception e) {
			System.err.println("Error");
		}
	}
}

public class LeastNumber {
	public static void main(String[] args) {

		LeastNum.smallNum(args[0], args[1]);

	}

}
