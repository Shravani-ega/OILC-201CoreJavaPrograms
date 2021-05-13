package assign29thApril;

public class SwapNoTemp {
	public static void main(String num[]) {

		int num1 = Integer.parseInt(num[0]);
		int num2 = Integer.parseInt(num[1]);

		System.out.println("Before Swapping given values are : " + num1 + "  " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After Swapping given values are  : " + num1 + "  " + num2);
	}
}
