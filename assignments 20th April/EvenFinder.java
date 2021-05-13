package assign19thApril;

class EvenFind {
	public static void  find(String str) {
		try {
			int num = Integer.parseInt(str);
			System.out.println(num % 2 == 0);

		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}

public class EvenFinder {

	public static void main(String[] args) {
		
		EvenFind.find(args[0]);

	}

}
