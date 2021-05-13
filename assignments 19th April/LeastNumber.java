package assign19thApril;

public class LeastNumber{
	public static void main(String[] args) {
		try {
		int a=Integer.parseInt(args[0]);
		
		int b=Integer.parseInt(args[1]);
		
		if(a<b)
		{
			System.out.println(a+ " is the Least Number");
			
		}
		else{
			System.out.println(b+" is the Least Number");
		}
	}

		catch(Exception e)
		{
			System.err.println("Error");
		}
	}

}
