package assign5thMay;

import java.util.Scanner;

public class NextMultipleOf100 {

	static int getNextMultipleOf100(int num) {
		int result = 0;

		if (num < 0) {
			result = -1;
		}else {
			int rem=num/100;
			 result=(rem+1)*100;
		}

		return result;
	}

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		
		System.out.println(getNextMultipleOf100(scanner.nextInt()));
		

	}

}
