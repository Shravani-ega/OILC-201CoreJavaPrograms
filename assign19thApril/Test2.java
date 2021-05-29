package assign19thApril;

class Remove {
	public static String removeString(String s1, String s2) {
		String s3 = " ";
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();

		for (int i = 0; i < b.length; i++) {

			if (a[0] == b[i] && a[1] == b[i + 1]) {
				s3 = s2.replaceAll(s1, "");
			}

		}

		return s3;
	}
}

public class Test2 {

	public static void main(String[] args) {

		System.out.println(Remove.removeString(args[0], args[1]));
	}

}
