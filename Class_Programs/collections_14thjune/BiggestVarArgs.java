package collections_14thjune;

public class BiggestVarArgs {

	static int biggest(int a, int... num) {

		System.out.println("Array size: " + num.length);
		int big = a;
		for (int x : num) {
			if (x > big) {
				big = x;
			}
		}
		return big;
	}

	public static void main(String[] args) {
		System.out.println("Biggest value = " + biggest(10, 2, 5));
	}
}
