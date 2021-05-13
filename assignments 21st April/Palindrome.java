package assign21stApril;

class Checker {
	public static boolean isPalindrome(int number) {

		int sum = 0;

		int temp = number;
		while (number > 0) {
			int r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		
		return (temp==sum);
	}
}

public class Palindrome {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if (num > 0) {
				System.out.println(Checker.isPalindrome(num));
			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}
