package assign19thApril;

public class EventFinder {

	public static void main(String[] args) {
		try {
		int a=Integer.parseInt(args[0]);
		System.out.println(a%2==0);

	}
		catch(Exception e){
			System.out.println("Error"+e);
		}
			
		}

}
