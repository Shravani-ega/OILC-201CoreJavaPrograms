package set_17th_june;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> h = new LinkedHashSet<String>();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("D");
		h.add("D");
		Iterator<String> i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
