package assign21stApril;

class SumFactors {
	public static void sumFact(int num) {
		if (num > 0) {
			int result = 0;
			System.out.println("Factors of the given number " + num + " are :");
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					result = result + i;
				}
			}
			System.out.println("Sum of the factors of the given number " + num + " is: " + result);
		} else {
			System.out.println("Error");
		}
	}
}

public class SumOfFactors {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);

			SumFactors.sumFact(num);

		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}
