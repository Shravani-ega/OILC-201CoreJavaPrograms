package assign5thMay;

import java.util.Scanner;

public class AlaramClock {

	static String ringAlaram(int weekNum, boolean vacation) {
		String result = "";

		String vac = String.valueOf(vacation);

		if ((weekNum >= 0 && weekNum <= 6) && (vac.equals("true") || vac.equals("false"))) {

			if ((weekNum > 0 && weekNum < 6) && vac.equals("true")) {

				result += "10:00";
			} else if ((weekNum >= 1 && weekNum <= 5) && vac.equals("false")) {

				result += "07:00";
			} else if ((weekNum == 0 || weekNum == 1) && vac.equals("true")) {

				result += "OFF";
			} else {

				result += "10:00";
			}

		} else {

			result = "Invalid Inputs";
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter week day and vacation");

		System.out.println(ringAlaram(scanner.nextInt(), scanner.nextBoolean()));
	}

}
