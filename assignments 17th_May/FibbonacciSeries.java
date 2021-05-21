package assign17_MAY;

import java.util.Scanner;

public class FibbonacciSeries {

	static String getFibbonacciSeries(int num) {
		String result = "";

		if (num <= 0) {
			result += "Null";
		} else if (num < 1 || num > 99) {
			result += "Null";
		} else {

			String res = "";
			int sum = 0;
			int n1 = 0, n2 = 1;
			res += n1 + ", " + n2 + " , ";
			for (int i = 2; i <num; i++) {
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
				if (i == num-1) {
					res += sum + " ";
				} else {

					res += sum + " ,";
				}
			}
			result = res;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(getFibbonacciSeries(scanner.nextInt()));
	}

}
