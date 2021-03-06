package assign17_MAY;

import java.util.Scanner;

public class PrimeNumbersSum {
	static int getPrimeNumbersSum(int startNum, int endNum) {
		int result = 0;
		
		if (startNum < 0 || endNum < 0) {
			result = -1;
		} else if (startNum == 0 || endNum == 0) {
			result = -2;
		} else if (startNum >= endNum) {
			result += -3;
		} else {
			int count = 0;
			for (int i = startNum; i <= endNum; i++) {

				for (int j = 1; j < i; j++) {

					if ((i % j) == 0) {

						count++;
					}
				}
				if (count == 1) {
					result = result + i;
				}
				count = 0;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println(getPrimeNumbersSum(scanner.nextInt(), scanner.nextInt()));
	}
}
