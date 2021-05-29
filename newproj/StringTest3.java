package newproj;

public class StringTest3 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello ");
		if (str1 == str2) {

			System.out.println("Both are same");
		} else {
			System.out.println("not same");
		}
		if (str1.equals(str2)) {

			System.out.println("Both are same");
		} else {
			System.out.println("not same");
		}

	}
}
