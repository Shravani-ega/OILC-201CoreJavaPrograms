package assign17_MAY;

import java.util.Scanner;

public class CricketScores {

	static String getDisplayDetails(int runs, float overs) {
		String result = "";

		int count = (int) (overs * 10);
		int q = count / 10;
		int r = count % 10;
		float balls = (q * 6) + r;
		if ((balls < 100) || (runs < 100)) {
			result = result + runs + " runs in " + (int) balls + " balls " + "@ "
					+ String.format("%.2f", (runs / balls)) + " runs per ball";
		} else {
			result = result + runs + " runs in " + overs + " overs " + " @ " + String.format("%.2f", (runs / overs))
					+ " runs per over";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Runs :");
		int runs = scanner.nextInt();
		System.out.println("Enter Overs :");
		float overs = scanner.nextFloat();

		System.out.println(getDisplayDetails(runs, overs));

	}

}
