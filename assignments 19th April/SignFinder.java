package assign19thApril;

public class SignFinder {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		try {
			if(num==0)
			{
				System.out.println("Zero");
			}
			else if(num>0) {
				System.out.println("Positive Value");
			}
			
			else
			{
				System.out.println("Negative Value");
			}
		}
		catch(Exception e)
		{
			System.err.println("Error");
		}

	}

}
