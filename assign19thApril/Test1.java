package assign19thApril;

//import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "ghkj";

		String s3 = s2.replace(s1, "");
		if (s3.equalsIgnoreCase(s2)) {
			System.out.println(-1);
		} else {
			System.out.println(s3);
		}
	}

}
