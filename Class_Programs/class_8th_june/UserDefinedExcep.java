package class_8th_june;

class NoMoneyException extends Exception {
	public NoMoneyException(String mess) {
		super(mess);
	}
}

public class UserDefinedExcep {

	public static void main(String[] args) {

		int balance = 1000, withdraw = 15000;
		try {
			if (balance < withdraw) {
				throw new NoMoneyException("No sufficient Balance");
			} else {
				System.out.println("Draw and Enjoy");
			}
		} catch (NoMoneyException e) {
			System.out.println(e);
		}
	}
}