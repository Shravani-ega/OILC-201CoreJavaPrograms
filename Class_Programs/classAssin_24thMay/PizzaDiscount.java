package classAssin_24thMay;

import java.util.Scanner;

public class PizzaDiscount {
	static int pizza_Cost = 300;
	static int total_bill = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Pizzas you want ?");
		int orders = scanner.nextInt();

		System.out.println("Total bill= " + getBill(orders));

	}

	static int getBill(int orders) {
		if (orders == 2) {
			int discount = ((pizza_Cost * 2) * 20) / 100;
			total_bill = (pizza_Cost * 2) - discount;
		} else {

			total_bill = pizza_Cost;
		}
		return total_bill;
	}
}
