package assign_16th_june;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListArrayToVector {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(40);
		list.add(23);
		list.add(45);
		list.add(28);

		Vector<Integer> v = new Vector<Integer>(list);
		System.out.println(v);
	}

}
