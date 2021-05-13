package assign19thApril;

public class SumOfDigits {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=a%10;
		int c=a/10;
		
		int sum=b+c;
		
		System.out.println("sum of the digits of the given number is: "+sum);

	}

}
