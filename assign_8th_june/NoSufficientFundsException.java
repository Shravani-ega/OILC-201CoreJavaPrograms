package assign_8th_june;

public class NoSufficientFundsException extends Exception {
	double amount;

	public double getAmount() {
		return amount;
	}

	NoSufficientFundsException(double amount) {

		this.amount = amount;
		System.out.println("Insufficient balance for withdrawing " + amount);
	}
}
