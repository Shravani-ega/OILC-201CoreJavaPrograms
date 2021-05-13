package assign21stApril;

class FactorialFinder {
	public static void factFind(int num) {
		int fact = 1;
		if (num > 0) {

			for (int i = 1; i <= num; i++) {
				fact = fact * i;
				}
			System.out.println("Factorial of the given number "+num+" is: "+fact);

		} else {
			System.out.println("Error");
		}
	}

}

public class Factorial {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);

			FactorialFinder.factFind(num);

		} catch (Exception e) {
			System.err.println("Error");

		}

	}
}
