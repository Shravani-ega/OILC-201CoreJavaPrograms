package assign21stApril;

class Armstrong {
	public static void armstrongChecker(int num) {
		int temp = num;
		int num2 = 0;

		if (num > 0) {
			while (num > 0) {
				int a = num % 10;
				num = num / 10;
				num2 = num2 + (a * a * a);
			}
			if (temp == num2)
				System.out.println("Armstrong Number");
			else
				System.out.println("Not Armstrong Number");
		} else {
			System.out.println("Error");
		}
	}
}

public class CheckArmstrong {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);

			Armstrong.armstrongChecker(num);

		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
