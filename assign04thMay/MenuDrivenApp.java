package assign04thMay;
import java.util.Scanner;

public class MenuDrivenApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String res = "";
		while (true) {
			String menu = "Menu Driven Application\n";
			menu += "1.Addition\n";
			menu += "2.Subtraction\n";
			menu += "3.Multiplication\n";
			menu += "4.Division\n";
			menu += "5.Exit\n";
			menu += "Choose any Option";
			System.out.println(menu);

			int ch = scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter two Numbers:");
				res = "sum=" + (scanner.nextInt() + scanner.nextInt());
				break;
			case 2:
				System.out.println("Enter two Numbers:");
				res = "Difference=" + (scanner.nextInt() - scanner.nextInt());
				break;
			case 3:
				System.out.println("Enter two Numbers:");
				res = "Product=" + (scanner.nextInt() * scanner.nextInt());
				break;
			case 4:
				System.out.println("Enter two Numbers:");
				res = "Division=" + (scanner.nextInt() / scanner.nextInt());
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;

			}
			System.out.println(res);
		}
		


	}

}