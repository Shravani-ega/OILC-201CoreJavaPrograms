package classAssin_24thMay;

import java.util.Scanner;

public class ArthematicOperations {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			display();

			int ch = scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.println(add());
				break;
			case 2:
				System.out.println(sub());

				break;
			case 3:
				System.out.println(mul());
				break;

			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Choice ...Choose between 1 to 4 \n");
				break;
			}
		}
	}

	static String mul() {
		System.out.println("Enter two Numbers to perform Multiplication :");
		return "Product of two numbers =" + (scanner.nextInt() * scanner.nextInt()) + "\n";
	}

	static String sub() {
		System.out.println("Enter 2 Numbers to perform Substraction :");
		return "Difference of two numbers =" + (scanner.nextInt() - scanner.nextInt()) + "\n";
	}

	static String add() {
		System.out.println("Enter 2 Numbers to Perform Addition :");
		return "Addition of two numbers =" + (scanner.nextInt() + scanner.nextInt()) + "\n";
	}

	static void display() {
		String menu = "____________Menu Driven Application_______________\n";
		menu += "           1.Addition              \n";
		menu += "           2.Subtraction           \n";
		menu += "           3.Multiplication        \n";
		menu += "           4.Exit                  \n";
		menu += "_______________________________________________________\n";
		menu += "Choose any Option";
		System.out.println(menu);
	}
}
