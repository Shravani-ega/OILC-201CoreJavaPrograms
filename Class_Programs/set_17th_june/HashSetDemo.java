package set_17th_june;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("C");
		hs.add("D");
		System.out.println(hs.add("D"));
		System.out.println(hs.add("D"));
		System.out.println(hs);
	}

}
