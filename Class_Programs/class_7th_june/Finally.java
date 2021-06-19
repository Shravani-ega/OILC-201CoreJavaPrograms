package class_7th_june;

public class Finally {
	public static void main(String[] args) {

		String sm = "javachamp 2021";
		String[] split = sm.split(" ");

		try {

			int i = Integer.parseInt(split[1]);
			System.out.println(i);

		} catch (Exception e) {
			System.out.println("2");
		} finally {

			System.out.println("3");
			System.exit(0);
		}
		System.out.println("4");
	}
}
