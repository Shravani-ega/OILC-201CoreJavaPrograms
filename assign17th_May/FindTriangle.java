package assign17th_May;

import java.util.Scanner;

public class FindTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of Triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(findTriangle(a, b, c));
	}

	private static String findTriangle(int a, int b, int c) {

		String result = "";
		if (a < 0 || b < 0 || c < 0) {
			result += -1;
		} else if (a == 0 || b == 0 || c == 0) {
			result += -2;
		} else if ((b + c) < a || (b + a) < c || (a + c) < b) {
			result += -3;

		} else {
			if (a == b && b == c) {
				result += "Equilateral Triangle";
			} else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a)) {
				result += "Isosceles Triangle";
			} else if (a != b && b != c && c != a) {
				result += "Scalene Triangle";
			}
		}
		return result;
	}
}
