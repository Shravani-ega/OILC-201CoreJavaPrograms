package assign27th_May_class;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Rectangle length and Breadth ");
		Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());

		System.out.println("Enter 2nd Rectangle length and Breadth ");
		Rectangle rectangle2 = new Rectangle(sc.nextDouble(), sc.nextDouble());

		rectangle.display();
		rectangle2.display();

	}

}
