package collections_14thjune;

public class VarArgs {

	static void disp(int... num) {

		System.out.println("Array size: " + num.length);
		for (int x : num) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		disp(1, 3, 55, 6, 7, 8, 56);
		disp(22, 56, 78);
		disp();

	}

}
