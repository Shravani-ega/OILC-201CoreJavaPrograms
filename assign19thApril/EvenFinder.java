package assign19thApril;

class EvenFind {
	public static boolean find(int num) {
		boolean str2 = false;

		if (num % 2 == 0) {
			str2 = true;
		}

		return str2;
	}
}

public class EvenFinder {

	public static void main(String[] args) {
		try {

			int num = Integer.parseInt(args[0]);

			System.out.println(EvenFind.find(num));

		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}
