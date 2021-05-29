package assign19thApril;

class Multi {
	static int mul(int num) {
		
		int quotient = num / 100;
		
		int multiple = (quotient + 1) * 100;
		
		return multiple;
	}
}

public class Multiple {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		
		System.out.println(Multi.mul(num));

	}

}
