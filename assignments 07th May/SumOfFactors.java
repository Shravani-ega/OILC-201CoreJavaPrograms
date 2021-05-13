package assign07thMay;

import java.util.Scanner;

public class SumOfFactors {
	
	
	static int sumOfFact(int givenNum) {
		int result = 0;

		if (givenNum <= 0) {

			result=-1;;
		} else {
			for (int i = 1; i < givenNum; i++) {

				if (givenNum % i == 0) {

					result =result +i;
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(sumOfFact(scanner.nextInt()));
	}

}
