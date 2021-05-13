package assign29thApril;

public class BiggestOfThree {

	public static void main(String[] args) {
          
		if(args.length!=3) {
			System.out.println("Please Enter three values only");
		}
		try {			
			
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			
			if(num1<num2) {
				num1=num2;
			}
			num2=Integer.parseInt(args[2]);
			if(num1<num2) {
				num1=num2;
			}
			System.out.println("Biggest of three numbers is : "+ num1);
			
		}catch(Exception e){
			System.err.println("Please Enter valid values");
			
		}
	}

}
