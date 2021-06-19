package arrayList_15thjune;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("Size = " + list.size());
		Integer num = new Integer(10);
		Float f1 = new Float(45.67f);
		String s = "Hello";
		Character c = new Character('c');
		Boolean b = new Boolean(false);

		list.add(num);
		list.add(f1);
		list.add(s);
		list.add(c);
		list.add(b);
		System.out.println("After Adding the size = " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
