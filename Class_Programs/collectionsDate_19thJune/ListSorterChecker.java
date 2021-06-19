package collectionsDate_19thJune;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class ListSorter {

	static List<Integer> sortIntList(List<Integer> list) {
		Collections.sort(list);
		return list;
	}
}

public class ListSorterChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		list.add(34);
		list.add(12);
		list.add(56);
		list.add(1);
		System.out.println("Assesnding Order");
		List<Integer> sortIntList = ListSorter.sortIntList(list);
		for (Integer x : sortIntList) {
			System.out.println(x);
		}
	}

}
