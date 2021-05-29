package assign5thMay;

import java.util.Scanner;

public class GreatestNumber {

	public static int getGreatest(int firstNum, int secNum) {
		int result = 0;

		if (firstNum < 0 || secNum < 0) {
			result = -1;
		} else if (firstNum == 0 || secNum == 0) {

			result = -2;
		}else  {
			if(firstNum>secNum) {
				result=firstNum;
			}
			else {
				result=secNum;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(getGreatest(scanner.nextInt(), scanner.nextInt()));
	}
}
