package predicate_18th_june;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List list1 = new LinkedList();
		List<Integer> list2 = new LinkedList<Integer>();
		list1.add(10);
		list1.add("Shravani");
		list1.add(true);

		Iterator iterator = list1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		list2.add(10);
		list2.add(10);
		list2.add(20);
		list2.add(null);
		// list2.add("Aneer");
		Iterator iterator2 = list2.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
