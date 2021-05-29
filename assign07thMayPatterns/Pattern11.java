package assign07thMayPatterns;

public class Pattern11 {

	public static void main(String[] args) {

		int a = 0;

		for (int i = 1; i <= 5; i++) {

			a = 1;

			for (int j = 1; j <= (5 - i); j++)
				System.out.print(" ");

			for (int k = 1; k <= i; k++) {
				System.out.print(a + " ");

				a = a * (i - k) / k;
			}

			System.out.println();
		}

	}

}
