package assign21thApril;

class CheckerScore {
	public static String getDisplayDetails(int runs, double overs) {
		String x = "";
		int count = (int) (overs * 10);
		int q = count / 10;
		int r = count % 10;
		double balls = (q * 6) + r;
		if ((balls < 100) || (runs < 100)) {
			x = x + runs + " runs in " + (int) balls + " balls " + " @ " + String.format("%.2f", (runs / balls))
					+ " runs per ball";
		} else {
			x = x + runs + " runs in " + overs + " overs " + " @ " + String.format("%.2f", (runs / overs))
					+ " runs per over";
		}
		return x;
	}

}

public class CricketScrores {

	public static void main(String[] args) {
		try {
			int runs = Integer.parseInt(args[0]);
			float overs = Float.parseFloat(args[1]);

			if (runs > 0 && overs > 0) {
				System.out.println(CheckerScore.getDisplayDetails(runs, overs));
			}
			else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.err.println("Error");
		}
	}

}
