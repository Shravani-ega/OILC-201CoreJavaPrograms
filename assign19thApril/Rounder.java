package assign19thApril;

class Round {
	public static void eRound(String str) {
		try {

			int num = Integer.parseInt(str);
			if (num % 2 != 0) {
				System.out.println(num);

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

public class Rounder {

	public static void main(String[] args) {
		Round.eRound(args[0]);
	}

}