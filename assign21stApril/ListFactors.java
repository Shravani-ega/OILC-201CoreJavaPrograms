package assign21stApril;

class FindFactors{
	public static void factors(int num) {
		if(num>0) {
			System.out.println("Factors of the given number "+ num +" are :");
			for(int i=1; i <= num; i++) {
		           if(num % i == 0)
		        	  
		               System.out.print(i+" ");
		       }
			
		}else {
			System.out.println("Error");
		}
   }
}

public class ListFactors {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			
			FindFactors.factors(num);

		} catch (Exception e) {
			System.err.println("Error");
		}
	}

}
