package com.ojas;

import java.util.Scanner;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		UserDaoImpl daoImpl = new UserDaoImpl();
		while (true) {

			System.out.println("`````````````````````````````````````````````");
			System.out.println("             1)CreateAccount                 ");
			System.out.println("             2)SignIn                 ");
			System.out.println("             3)SignOut                 ");
			System.out.println("`````````````````````````````````````````````");
			System.out.println("Enter The Choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.reigster();
				break;
			case 2:
				System.out.println("Enter Email ");
				String email = sc.next();
				System.out.println("Enter The PassWord");
				String pass = sc.next();
				boolean flag = daoImpl.verifyLogin(email, pass);
				if (flag)
					System.out.println("*****************Valid User******************************");
				else
					System.out.println("*************Ivalid UserName And PassWord*************");
				break;
			case 3:
				System.out.println("Thank you for Using App!");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 3 Between");

			}// end of switch

		} // end of while
	}
}
