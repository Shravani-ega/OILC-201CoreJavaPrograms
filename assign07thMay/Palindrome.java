package assign07thMay;

import java.util.Scanner;

public class Palindrome {
	
	
	static String findPalindrome(int num) {
		String result="";
		int sum=0;
		int temp=num;
		
		
		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if(sum==temp) {
			
			result+="Given Number "+temp+" is a Palindrome Number";
		}else {
			
			result+="Given Number "+temp+" is a Not a Palindrome Number";

			
		}

		
		
		return result;
		
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(findPalindrome(scanner.nextInt()));
	}

}
