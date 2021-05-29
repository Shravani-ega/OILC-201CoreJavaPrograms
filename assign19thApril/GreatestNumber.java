package assign19thApril;

class GreatestNum {
	public static void bigNumber(String str1, String str2) {
		try {
			int num1 = Integer.parseInt(str1);
	        int num2 = Integer.parseInt(str2);

			if (num1 > num2) {
				System.out.println(num1 + " is the Greatest Number");

			} else {
				System.out.println(num2 + " is the Greatest Number");
			}
		}

		catch (Exception e) {
			System.err.println("Error");
		}
	}
}

public class GreatestNumber {

	public static void main(String[] args) {

		GreatestNum.bigNumber(args[0], args[1]);
	}

}
