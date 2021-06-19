package set_17th_june;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("ramu");
		t.add("Ameer");
		t.add("Shravani");
		t.add(null);
		t.add(10);

		System.out.println(t);
	}

}
//"ramu".compareTo("Ameer");