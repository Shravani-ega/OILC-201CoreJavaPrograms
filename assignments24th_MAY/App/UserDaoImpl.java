package app;

import java.util.Scanner;

class UserDaoImpl {

	static User user = new User();

	static Scanner scanner = new Scanner(System.in);

	static void register() {

		System.out.println("Enter user id :");
		user.uid = scanner.nextInt();
		System.out.println("Enter First name :");
		user.firstName = scanner.next();
		System.out.println("Enter last name :");
		user.lastname = scanner.next();
		System.out.println("Enter email :");
		user.email = scanner.next();
		System.out.println("Enter password :");
		user.password = scanner.next();

		System.out.println("Registered ::");
	}

	static boolean veryLogin(String eamil, String password) {
		boolean b = false;
		User user = new User();
		String ema = user.email;
		String pwd = user.password;
		if (ema.equals(eamil) && pwd.equals(password)) {

			b = true;
		}

		return b;
	}

	static void signOut() {

		System.exit(0);
	}

}