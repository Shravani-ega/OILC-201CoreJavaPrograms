package assign24thApril;

class Sequence {

	static String getSequence(int n) {
		String str = "";
		str = str + "" + n;
		int count = 0;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (3 * n) + 1;
			}
			count++;
			str = str + " " + n;
		}
		if (count < 100) {
			return str;
		} else {
			return "Doesnot Conerge";
		}
	}
}

public class CollatzSequence {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if (num > 1 && num < 100) {

				System.out.println(Sequence.getSequence(num));

			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}
