package assign_15th_june;

import java.util.List;

public class ListToArray {

	Integer[] convertToArray(List<Integer> list) {
		Integer[] array = new Integer[list.size()];
		array = list.toArray(array);
		return array;
	}
}
