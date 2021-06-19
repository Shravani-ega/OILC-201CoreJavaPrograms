package collections_14thjune;

public class BoxingDemo {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		Integer i = new Integer(num);
		System.out.println(i);
		int b = i.intValue();
		System.out.println(b);

		int a = 40;
		System.out.println(a);
		Integer c = a;
		System.out.println(c);
		int d = c;
		System.out.println(d);

	}

}
