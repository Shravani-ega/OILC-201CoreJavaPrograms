package assign04thMay;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = s.nextInt();

		String res = "";

		switch (num % 2) {
		case 0:
			res = num + " is Even";
			break;
		case 1:
			res = num + " is Odd";
			break;
		}
		System.out.println(res);
	}

}
