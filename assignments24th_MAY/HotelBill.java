package classAssin_24thMay;

import java.util.Scanner;

public class HotelBill {
	static Scanner scanner = new Scanner(System.in);
	static int idly_cost = 40;
	static int dosa_cost = 60;
	static int vada_cost = 50;
	static int poori_cost = 30;
	static int bonda_cost = 20;

	static int idly_bill = 0;
	static int dosa_bill = 0;
	static int vada_bill = 0;
	static int poori_bill = 0;
	static int bonda_bill = 0;
	static int total_bill = 0;

	static void displayMenu() {

		String menu = "____________________________________________\n";
		menu += "           Menu For Breakfast :               \n";
		menu += "____________________________________________  \n";
		menu += "                 1 .Idly                      \n";
		menu += "                 2. Dosa                      \n";
		menu += "                 3. Vada                      \n";
		menu += "                 4. Poori                     \n";
		menu += "                 5. Bonda                     \n";
		menu += "                 6. Exit                      \n";
		menu += "_____________________________________________ \n";

		System.out.println(menu);
	}

	static int bonda_Price() {
		System.out.println("How many plates you want Bonda :");
		int orders = scanner.nextInt();
		bonda_bill = orders * bonda_cost;
		return bonda_bill;
	}

	static int poori_Price() {
		System.out.println("How many plates you want Poori :");
		int orders = scanner.nextInt();
		poori_bill = orders * poori_cost;
		return poori_bill;
	}

	static int vada_Price() {
		System.out.println("How many plates you want Vada :");
		int orders = scanner.nextInt();
		vada_bill = orders * vada_cost;
		return vada_bill;
	}

	static int dosa_price() {
		System.out.println("How many plates you want Dosa :");
		int orders = scanner.nextInt();
		dosa_bill = orders * dosa_cost;
		return dosa_bill;
	}

	static int idly_Price() {
		System.out.println("How many plates you want Idly :");
		int orders = scanner.nextInt();
		idly_bill = orders * idly_cost;
		return idly_bill;
	}

	public static void main(String[] args) {

		while (true) {

			displayMenu();
			System.out.println("Enter your Choice :");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				idly_bill = idly_Price();
				System.out.println("Idly bill = " + idly_bill);
				break;
			case 2:
				dosa_bill = dosa_price();
				System.out.println("Dosa bill = " + dosa_bill);
				break;
			case 3:
				vada_bill = vada_Price();
				System.out.println("Vada Bill = " + vada_bill);
				break;
			case 4:
				poori_bill = poori_Price();
				System.out.println("Poori Bill = " + poori_bill);
				break;

			case 5:
				bonda_bill = bonda_Price();
				System.out.println("Bonda_bill = " + bonda_bill);
				break;

			case 6:
				total_bill = idly_bill + dosa_bill + vada_bill + poori_bill + bonda_bill;

				System.out.println("Total Ordered  bill == " + total_bill);
				System.exit(0);
			}
		}
	}
}
