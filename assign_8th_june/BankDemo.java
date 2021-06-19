package assign_8th_june;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) throws NoSufficientFundsException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number");
		int acno = sc.nextInt();
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		CheckingAccount obj = new CheckingAccount(acno, balance);
		System.out.println("Enter amount to depost");
		obj.deposit(sc.nextInt());
		System.out.println("Enter amount to withdraw");
		double withdraw = obj.withdraw(sc.nextInt());
		System.out.println("Your balance is=" + withdraw);
	}
}
