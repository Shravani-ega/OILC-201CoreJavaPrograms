package assign19th_MAY;

import java.util.Scanner;

public class MaskEmailId {

	static String maskEmail(String mail) {
		StringBuffer maskString = new StringBuffer(mail);

		for (int i = 2; maskString.charAt(i) != '@'; i++) {
			maskString.setCharAt(i, '*');
		}

		return maskString.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your EMAIL ID");

		System.out.println("Masked mail is : " + maskEmail(scanner.nextLine()));
	}

}
