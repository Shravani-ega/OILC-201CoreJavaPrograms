package com.ojas;

import java.util.Scanner;

public class UserDaoImpl {

	Scanner sc = new Scanner(System.in);
	User addUsers[] = null;

	public void reigster() {
		System.out.println("How Many Users Can Represent");
		int size = sc.nextInt();
		addUsers = new User[size];
		for (int i = 0; i < addUsers.length; i++) {
			System.out.println("Enter User Id ");
			int uid = sc.nextInt();
			System.out.println("Enter First Name :");
			String fname = sc.next();
			System.out.println("Enter Last Name");
			String lname = sc.next();
			System.out.println("Enter Email ");
			String email = sc.next();
			System.out.println("Enter Mobile Number ");
			long mb = sc.nextLong();
			System.out.println("Enter The PassWord");
			String pass = sc.next();

			User user = new User();
			user.setUid(uid);
			user.setFirstName(fname);
			user.setLastName(lname);
			user.setEmail(email);
			user.setMobile_Number(mb);
			user.setPassword(pass);

			addUsers[i] = user;
			System.out.println("User Register Successfully");
		} // end of for loop
	}// end of register

	public boolean verifyLogin(String email, String pass) {
		boolean flag = false;

		for (User user : addUsers) {
			if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
				flag = true;
			}

		}
		return flag;
	}
}