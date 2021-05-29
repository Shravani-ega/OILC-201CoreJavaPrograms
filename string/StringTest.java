package string;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("Before " + str + " " + str.hashCode());
		 str += "Hello";
		System.out.println("After  " + str + " " + str.hashCode());

		StringBuffer stringBuffer = new StringBuffer("Hello");
		System.out.println("Before " + stringBuffer + " " + stringBuffer.hashCode());
		stringBuffer.append("Welocome"  );
		System.out.println("After " + stringBuffer + " " + stringBuffer.hashCode());
	}

}
