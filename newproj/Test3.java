package newproj;

public class Test3 {
	 public static void methodOne()
	 {
		 System.out.println("Hello");
		 methodTwo();
	 }

	private static void methodTwo() {
		System.out.println("hii");
		methodOne();
		
	}
	public static void main(String a[]) {
		methodOne();
		System.out.println("welocme");
		 
	}

}
