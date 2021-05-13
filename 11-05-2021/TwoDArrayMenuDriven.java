package assign11thMay;

import java.util.Scanner;

public class TwoDArrayMenuDriven {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];

		Scanner scanner = new Scanner(System.in);

		int[][] res = new int[2][2];
		while (true) {
			String menu = "Menu Driven Application\n";
			menu += "1.Addition\n";
			menu += "2.Subtraction\n";
			menu += "3.Multiplication\n";
			menu += "4.Exit\n";
			menu += "Choose any Option";
			System.out.println(menu);

			int ch = scanner.nextInt();

			switch (ch) {
			case 1:
				declareArray(a, b);
				System.out.println("Addition of Two arrays :");
				res = sum(a, b);
				display(res);
				break;
			case 2:
				declareArray(a, b);
				System.out.println("Substaction of Two arrays :");
				res = substraction(a, b);
				display(res);

				break;
			case 3:
				declareArray(a, b);
				System.out.println("Multiplication of Two arrays :");
				res = multiplication(a, b);
				display(res);

				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;

			}
		}
	}

	static void declareArray(int[][] a, int[][] b) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st array Elements");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + (i + 1) + " row values");

			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter 2nd array Elements");
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter " + (i + 1) + " row values");

			for (int j = 0; j < b[i].length; j++) {

				b[i][j] = scanner.nextInt();
			}
		}
	}

	static void display(int[][] res) {
		for (int i = 0; i < res.length; i++) {

			for (int j = 0; j < res[i].length; j++) {

				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] multiplication(int[][] a, int[][] b) {
		int[][] mul = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				for (int k = 0; k < 3; k++) {

					 mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
				}
			}
		}

		return mul;
	}

	static int[][] substraction(int[][] a, int[][] b) {
		int[][] sub = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				sub[i][j] = a[i][j] - b[i][j];
			}
		}

		return sub;
	}

	static int[][] sum(int a[][], int b[][]) {

		int[][] sum = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		return sum;
	}
}
