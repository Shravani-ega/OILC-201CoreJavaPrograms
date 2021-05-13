package assign24thApril;


public class RussionMultiplication {

	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println("RussionMultiplication of "+n1+" and "+n2+" is "+getProduct(n1, n2));
	}

	private static String getProduct(int num1, int num2) {
		int product = 0;
		if (num1 > 0 && num2 > 0) {
			if (num1 % 2 != 0)
				product = product + num2;
			while (num1 != 1) {
				num1 = num1 / 2;
				num2 = num2 * 2;
				if (num1 % 2 != 0)
					product = product + num2;
			}

			return "" + product;
		} else
			return "" + (-1);
	}
}