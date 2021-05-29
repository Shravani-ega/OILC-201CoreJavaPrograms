package assign19thApril;

class DigitCheck {
	public static int digiCheck(int num) {

		int farg = num / 10;
		int sarg = num % 10;

		return Math.abs(farg-sarg);


	}
}

public class DigitChecker {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);

		System.out.println(DigitCheck.digiCheck(num));

	}

}
