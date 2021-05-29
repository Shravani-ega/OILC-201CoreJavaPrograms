package assign19thApril;

class AlaramClockChecker {
	public static void clockChecker(String str1, String str2) {
		try {
			int n = Integer.parseInt(str1);

			if ((n < 0) || (n > 6))
				System.out.println(10 / 0);

			boolean b = true;
			if (str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("false"))
				b = Boolean.parseBoolean(str2);
			else
				System.out.println(10 / 0);
			if ((n == 0) || (n == 6)) {
				if (b)
					System.out.println("off");
				else
					System.out.println("10:00");
			} else if ((n > 0) && (n < 6)) {
				if (b) {
					System.out.println("10:00");

				} else
					System.out.println("7:00");

			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}

public class AlaramClock {

	public static void main(String[] args) {
		AlaramClockChecker.clockChecker(args[0],args[1]);

	}

}
