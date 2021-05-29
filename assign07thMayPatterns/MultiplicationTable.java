package assign07thMayPatterns;

import java.util.Scanner;

public class MultiplicationTable {
	
	
	static String findTables(int start, int end) {
		
		String result="";
		
		for(int rows=start;rows<=end;rows++) {
			
			for(int cols=1;cols<=10;cols++) {
				
				result+=rows+" *"+cols+" ="+(rows*cols)+"\n";
				
			}
			result+="**********************"+"\n";

		}
		
		
		return result;
		
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");

		System.out.println(findTables(scanner.nextInt(),scanner.nextInt()));
		
	}

}
