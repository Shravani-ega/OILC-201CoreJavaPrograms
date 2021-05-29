package assign19thApril;

class OddRound {
	public static void rounder(String str) {
		try {

			int num = Integer.parseInt(str);
			if (num % 2 == 0) {
				System.out.println("EvenNumber");
			} else if (num < 0) {
				System.out.println("Error");
			} else {
				int d = num / 10;
				int Rounder = (d + 1) * 10;
				System.out.println("Next multiple of ten for the given number" + num + " is " + Rounder);

			}
		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}

public class OddRounder {

	public static void main(String[] args) {

		OddRound.rounder(args[0]);

	}

}
