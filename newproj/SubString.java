package newproj;

public class SubString {

	public static void main(String[] args) {

		String s1 = "xyz";
		String s2 = "abxcdaaabcda";

		String s3 = "";
		StringBuffer sb = new StringBuffer(s2);
		StringBuffer sc = new StringBuffer(s1);

		int count = 0;

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < sb.length(); j++) {

				if (sc.charAt(i) == sb.charAt(j)) {

					if (j + sc.length() <= sb.length()) {
						for (int k = j; k < j + sc.length(); k++) {

							s3 = s3 + sb.charAt(k);

						}
						if (s3.equals(s1)) {
							sb = sb.delete(j, j + sc.length());
							j--;
							count++;

						}
						s3 = "";
					}
				}
			}
		}
		if (count > 0) {
			System.out.println(sb);
		} else {
			System.out.println(-1);
		}

	}
}
