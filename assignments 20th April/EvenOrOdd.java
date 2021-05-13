package assign19thApril;

class EvenOddFinder {
	public static void evenOdd(String str) {

		try {
			int num = Integer.parseInt(str);
			if (num % 2 == 0)
				System.out.println("Even Number");
			else
				System.out.println("Odd Number");

		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}

public class EvenOrOdd {

	public static void main(String[] args) {

		EvenOddFinder.evenOdd(args[0]);

	}
}
