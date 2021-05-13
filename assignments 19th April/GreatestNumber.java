package assign19thApril;

public class GreatestNumber {

	public static void main(String[] args) {
		try {
		int a=Integer.parseInt(args[0]);
		
		int b=Integer.parseInt(args[1]);
		
		if(a>b)
		{
			System.out.println(a+ " is the Greatest Number");
			
		}
		else{
			System.out.println(b+" is the Greatest Number");
		}
	}

		catch(Exception e)
		{
			System.err.println("Error");
		}
	}

}
