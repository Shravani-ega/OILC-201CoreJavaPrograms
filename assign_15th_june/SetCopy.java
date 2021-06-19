package assign_15th_june;

import java.io.*;
import java.util.*;

public class SetCopy {

	int copySets(Set<Integer> s1, Set<Integer> s2) {
		int result = 0;
		if (s1.equals(null) || s1.size() == 0) {
			result = 1;
		} else {
			for (Integer x : s1) {
				s2.add(x);
			}
		}
		// System.out.println(s1);
		System.out.println(s2);
		return result;
	}
}
