package assign19thApril;

public class Sum {

	public static void main(String[] args) {
		try {
			
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
        int num3=Integer.parseInt(args[2]);
        
        if(num1>0 && num2>0 && num3>0)
        {
        int res1=((num1/10)+1)*10;
     
        int res2=((num2/10)+1)*10;
        
        int res3=((num3/10)+1)*10;
        
        int Result=res1+res2+res3;
        
        System.out.println("Sum of the Rounded values: "+Result);
        
		}
        else
        {
        	System.out.println("Error");
        }
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		}

}
