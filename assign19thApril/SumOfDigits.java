package assign19thApril;

class SumDigits {

	static int sum(int num) {

		int farg = num % 10;
		int sarg = num / 10;

		return (farg + sarg);

	}
}

public class SumOfDigits {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);

		int result = SumDigits.sum(num);

		System.out.println(result);

	}

}