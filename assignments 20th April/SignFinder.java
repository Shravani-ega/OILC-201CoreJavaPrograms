package assign19thApril;

class SignFind {
	public static void finder(String str) {
		int num = Integer.parseInt(str);
		try {
			if (num == 0) {
				System.out.println("Zero");
			} else if (num > 0) {
				System.out.println("Positive Value");
			}

			else {
				System.out.println("Negative Value");
			}
		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}

public class SignFinder {

	public static void main(String[] args) {
		SignFind.finder(args[0]);

	}

}
