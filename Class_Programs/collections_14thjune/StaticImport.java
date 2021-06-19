package collections_14thjune;

import static java.lang.Integer.*;
import static java.lang.System.*;

public class StaticImport {

	static void sum(int a, int b) {
		out.println("Sum = " + (a + b));
	}

	public static void main(String[] args) {

		int a = parseInt(args[0]);
		int b = parseInt(args[1]);
		sum(a, b);
	}
}
