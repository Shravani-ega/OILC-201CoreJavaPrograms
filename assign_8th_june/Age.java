package assign_8th_june;

import java.util.Scanner;

class NotValidAge extends Exception {
	public NotValidAge(String message) {
		super(message);
	}

}

public class Age {

	public static void main(String[] args) throws NotValidAge {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		try {
			if (age <= 0) {
				throw new NotValidAge("Age is not valid");
			} else {
				System.out.println("Age is valid");
			}
		} catch (NotValidAge e) {
			System.out.println(e.getMessage());
		}
	}

}
