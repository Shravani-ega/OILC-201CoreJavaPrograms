package string;

public class StringDemo2 {

	public static void main(String[] args) {
		Integer i = 20;
		String s = i.toString();
		System.out.println(s);
		String valueOf = String.valueOf(i);
		System.out.println(valueOf);

		int num = 1234;
		String m = String.valueOf(num);
		System.out.println(m);
		System.out.println(m.length());

		Float f = new Float(22.2f);
		String ss = String.valueOf(f);
		System.out.println(ss);

		String str = "Hello";
		s.concat("Ramu");
		System.out.println(str);

	}

}
