package class_7th_june;

public class ExceptionsDemo {

	public static void main(String[] args) {

		System.out.println("Welcome1");
		System.out.println("Welcome2");
		System.out.println("Welcome3");
		System.out.println("Welcome4");
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("Dont Enter Denominator as Zero "+e);
		}
		System.out.println("Welcome5");
		System.out.println("Welcome6");
		System.out.println("Welcome7");

	}

}
