package assign04thMay;

import java.util.Scanner;

class MonthDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			String menu = "Menu Driven \n";
			menu += "1.Addition\n";
			menu += "2.Substraction\n";
			menu += "3,Multipication\n";
			menu += "4.Division\n";
			menu += "5.Exit\n";
			menu += "Select any option? \n";
			System.out.println(menu);

			int choice = sc.nextInt();

			String result = "";

			switch (choice) {
			case 1:
				System.out.println("Enter two numbers :");
				result = "Sum of Two numbers is : " + (sc.nextInt() + sc.nextInt());
				break;
			case 2:
				System.out.println("Enter two numbers :");
				result = "Substraction  of Two numbers is : " + (sc.nextInt() - sc.nextInt());
				break;
			case 3:
				System.out.println("Enter two numbers :");
				result = "Multiplication  of Two numbers is : " + (sc.nextInt() * sc.nextInt());
				break;
			case 4:
				System.out.println("Enter two numbers :");
				result = "Sum of Two numbers is : " + (sc.nextInt() / sc.nextInt());
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option");

			}
			System.out.println(result);
		}
	}
}
