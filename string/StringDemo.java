package string;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hello Every one ";
		System.out.println("length=" + str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("lo"));

		byte b[] = { 65, 66, 67, 68, 69, 70 };

		String string = new String(b);
		System.out.println(string);

		byte[] bytes = string.getBytes();
		for (Byte x : bytes) {

			System.out.println(x);
		}
	}

}
