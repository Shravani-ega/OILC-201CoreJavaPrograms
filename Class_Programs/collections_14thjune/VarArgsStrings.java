package collections_14thjune;

public class VarArgsStrings {
	static void studInfo(int a, String... cnames) {
		System.out.println("No :" + a);
		System.out.println("Course Names :");
		for (String x : cnames) {
			System.out.println(x);
		}
	}

	public static void main(String... args) {
		studInfo(10, "Java", "Unix", "Python");
		studInfo(10, args);
	}
}
