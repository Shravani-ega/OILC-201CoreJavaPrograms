package assign19thApril;

public class ThreeDPalindrome {

	public static void main(String[] args) {
	  
	  String str=args[0];
	  
	  int n=str.length();
	  
	  String x = "";
	  x=x+str.charAt(n-1)+str.charAt(n-2)+str.charAt(n-3);
	  System.out.println(str.equals(x));
	  
	 

	
	}

}