package assign5thMay;

import java.util.Scanner;

public class NaturalNumbers {

	static String getNaturalNumbers(int startNum, int endNum) {

		String result = "";
		if (startNum < 0 || endNum < 0) {

			result += -1;

		} else if (startNum == 0 || endNum == 0) {
			result += -2;
		} else if (startNum < endNum) {

			int i = startNum;
			while (i <= endNum) {

				result += i + " ";
				i++;
			}

		}else {
			result+="Number1 is greter then number2 :";
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		System.out.println(getNaturalNumbers(scanner.nextInt(), scanner.nextInt()));
	}

}
