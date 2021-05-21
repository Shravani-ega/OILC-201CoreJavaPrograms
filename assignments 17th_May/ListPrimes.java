package assign17_MAY;

import java.util.Scanner;

public class ListPrimes {
	static String getPrimeNumbers(int startNum, int endNum) {
		String result = "";
		if (startNum <= 0 || endNum <= 0) {
			result += -1;
		} else if (startNum >= endNum) {
			result += -2;
		} else {
			int count = 0;
			for (int i = startNum; i <= endNum; i++) {

				for (int j = 1; j < i; j++) {

					if ((i % j) == 0) {

						count++;
					}
				}
				if (count == 1) {
					result += i + " ";
				}
				count = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		System.out.println(getPrimeNumbers(scanner.nextInt(), scanner.nextInt()));
	}
}
