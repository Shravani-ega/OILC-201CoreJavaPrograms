package assign19thApril;

public class EvenOrOdd {

	public static void main(String[] args) {
		 try {
		int num=Integer.parseInt(args[0]);
		if(num%2==0)
			System.out.println("Even Number");
		else 
		System.out.println("Odd Number");
		
	}
		 catch(Exception e)
		 {
			 System.out.println("Error");
		 }

}
}
