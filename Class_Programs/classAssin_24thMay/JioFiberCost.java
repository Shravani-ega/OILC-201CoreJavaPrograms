package classAssin_24thMay;

import java.util.Scanner;

public class JioFiberCost {

	static int getBill(int price, int gst) {

		int gstAmmount = (price * gst) / 100;
		return gstAmmount + price;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Price :");
		int price = scanner.nextInt();
		System.out.println("Enter Gst Percentage :");
		int gst = scanner.nextInt();
		System.out.println("Total Bill = " + getBill(price, gst));
	}
}
