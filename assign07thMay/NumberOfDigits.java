package assign07thMay;

import java.util.Scanner;

public class NumberOfDigits {
	
	
	 static int findDigits(int num)
	{
		int count=0;
		
		while(num>0) {
			int rem=num%10;
			count++;
			num=num/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println("Number of Digits Of the number : "+findDigits(scanner.nextInt()));
	}

}
