package assign_16th_june;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorToArrayList {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(50);
		v.add(40);
		v.add(23);
		v.add(45);
		v.add(28);

		List<Integer> list = new ArrayList<Integer>(v);
		System.out.println(v);
	}
}
