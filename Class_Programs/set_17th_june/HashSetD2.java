package set_17th_june;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetD2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("C");
		hs.add("D");
		hs.add("B");
		hs.add("B");
		hs.add("P");
		hs.add("M");
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
