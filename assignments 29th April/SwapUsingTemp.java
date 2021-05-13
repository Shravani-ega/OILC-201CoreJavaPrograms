package assign29thApril;

public class SwapUsingTemp {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		System.out.println("Before Swapping given values are : " + num1 + "  " + num2);

		int temp = 0;

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After Swapping values are : " + num1 + "  " + num2);
	}

}
