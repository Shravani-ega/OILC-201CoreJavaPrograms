package class_7th_june;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {

			System.out.println(args[1]);
		} catch (Exception e) {
			System.out.println("Invalid Argumrnts " + e.getMessage());
		}
		System.out.println("Hello");
	}

}
