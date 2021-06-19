package class_7th_june;

public class NullPointer {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String str = null;
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("" + e);
		}
		System.out.println("hello ");
	}

}
