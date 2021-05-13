package assign19thApril;

public class DigitChecker {

	public static void main(String[] args) {
	 int a= Integer.parseInt(args[0]);
	
	 int b= a/10;
	 int c= a%10;
	 
     int check=b-c;
     
     System.out.println("Digits Difference is "+check);

	}

}
