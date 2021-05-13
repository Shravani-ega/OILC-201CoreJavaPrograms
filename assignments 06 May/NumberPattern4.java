package assign06thMay;

import java.util.Scanner;

public class NumberPattern4 {
	
	
static String createNumPattern(int val) {
		
		String result="";
		
		if(val<0) {
			
			result+=-1;
			
		}
		else if(val==0){
			result+=-2;
		}else {
			for(int i=1;i<=val;i++) {
				
				for(int j=1;j<=i;j++) {
					
					result+=(i*j)+" ";
				}
				result+="\n";
			}
			
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println(createNumPattern(scanner.nextInt()));

	}

}
