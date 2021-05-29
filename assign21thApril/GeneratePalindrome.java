package assign21thApril;

class PalindromeGenerate {
	
	static String output="";
	static String getPalindromeList(int num) {
		int x, r, rev=0, sum;
		x=num;
		output = output + x	 ;
		while(num > 0) {
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		if(rev == x)
			return output;
		output = output + "," + rev + ",";
		sum = x + rev;
		return getPalindromeList(sum);
		}
	}


public class GeneratePalindrome {

	public static void main(String[] args) {
		try {

			int num = Integer.parseInt(args[0]);
			if (num >= 100 && num <= 999) {
					System.out.println(PalindromeGenerate.getPalindromeList(num));

			} else {
				System.out.println(10 / 0);
			}

		} catch (Exception e) {
			System.err.println("Error");
		}
	}

}
