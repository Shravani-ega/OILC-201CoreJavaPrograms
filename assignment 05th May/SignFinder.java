package assign5thMay;

import java.util.Scanner;

public class SignFinder {
	static int findSum(int givenNum) {
		int result = 0;
         if(givenNum>0) {
        	 result=1;
        	 
         }else if(givenNum<0) {
        	 result=-1;
         }else {
        	 result=0;
         }
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(findSum(scanner.nextInt()));
	}

}
