package class_7th_june;

public class TryDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {

			Object object = new Object();
			TryDemo d = (TryDemo) object;
		} catch (Exception e) {

			System.out.println("" + e);
		}
		System.out.println("Hello ..");
	}

}
