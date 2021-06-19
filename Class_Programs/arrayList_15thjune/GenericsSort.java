package arrayList_15thjune;

import java.util.ArrayList;
import java.util.Collections;

public class GenericsSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(34);
		list.add(2);

		Collections.sort(list);
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
