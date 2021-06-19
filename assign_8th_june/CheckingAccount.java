package assign_8th_june;

public class CheckingAccount {

	int accountNo;
	double balance;

	CheckingAccount(int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	boolean checkAccount(int accountNo) {
		boolean b = false;
		if (this.accountNo == accountNo) {

			return true;
		}
		return b;
	}

	void deposit(int amount) {
		if (checkAccount(accountNo)) {
			System.out.println(amount + " is deposited ");
			System.out.println("Your Account balane is :" + (balance + amount));
		} else {
			System.out.println("Invalid user");
		}

	}

	double withdraw(int amount) throws NoSufficientFundsException {
		try {
			if (amount > balance) {
				throw new NoSufficientFundsException(amount);
			} else {

				balance = balance - amount;
			}
		} catch (NoSufficientFundsException e) {
		}

		return balance;
	}
}
