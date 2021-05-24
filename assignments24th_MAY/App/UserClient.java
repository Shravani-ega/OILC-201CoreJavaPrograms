package app;

import java.util.Scanner;

class UserClient {

	public static void main(String[] args) {

		System.out.println("``````````````````````````````````");
		System.out.println("````````````1. Create Account`````````");
		System.out.println("````````````2.Signin``````````````````");
		System.out.println("````````````3.Signout`````````````````");

		Scanner scanner = new Scanner(System.in);
		UserDaoImpl daoImpl = new UserDaoImpl();

		daoImpl.register();

		System.out.println("Enter email");
		String eamil = scanner.next();
		System.out.println("Enter password");
		String pwd = scanner.next();

		boolean veryLogin = daoImpl.veryLogin(eamil, pwd);
		if (veryLogin) {
			System.out.println("Sign successfully :");
		} else {

			System.out.println("Faild to signin ");
		}
		daoImpl.signOut();
	}
}
