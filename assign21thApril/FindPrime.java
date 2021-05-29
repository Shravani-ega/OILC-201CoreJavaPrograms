package assign21thApril;

class Prime {
	public static boolean isPrime(int number) {
		boolean result = true;
		if (number <= 1) {
			result = false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					result = false;
				}
			}
		}
		return result;
	}
}

public class FindPrime {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if (num > 0) {
				System.out.println(Prime.isPrime(num));
			}else {
			System.out.println("Error");
			}

		} catch (Exception e) {
			System.err.println("Error");
		}

	}

}
