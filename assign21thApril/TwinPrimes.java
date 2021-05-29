package assign21thApril;

class TwinPrimesFinder {
	static String getTwinPrimes(int num1, int num2) {
		String s = "";
		int a[] = new int[89];
		int x = 0;
		for(int i = num1;i <= num2;i++) {
			boolean b = true;
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					b=false;
					break;
				}
			}
			if(b) {
				a[x] = i;
				x++;
			}
		}
		for(int i = 0; i < x;i++) {
			if(a[i+1] - a[i] == 2) {
				s = s + a[i] + "," + a[i+1] + "; ";
			}
		}
		return s;
	}
	
}
public class TwinPrimes{
	public static void main(String[] args) {
		try {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		boolean b = true;
		if((num1<1 && num2< 1) || (num2 > 100 && num1>100) || (num1 >= num2)) {
			System.out.println("Error");
			b = false;
		}
		if(b) {
			System.out.println(TwinPrimesFinder.getTwinPrimes(num1, num2));
		}
		}catch(Exception e)
		{
			System.err.println("Error"+e);
		}
	}

}
