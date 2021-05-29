package assign21stApril;

class Armstrong {
	public static String armstrongChecker(int num) {
		String result="";
		int temp = num;
		int num2 = 0;

			while (num > 0) {
				int a = num % 10;
				num2 = num2 + (a * a * a);
				num = num / 10;
			}
			if (temp == num2)
				result="Armstrong Number";
			else
				result=" Not Armstrong Number";
		return result;
	}
}

public class CheckArmstrong {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if (num > 0) {

			System.out.println(Armstrong.armstrongChecker(num));
			}else {
				System.out.println("Error");
			}
		} 
		catch (Exception e) {
			System.err.println("Error");
		}
	}
}
