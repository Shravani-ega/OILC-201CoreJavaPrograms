package assign_15th_june;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Checker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		System.out.println("Enter size of the Set");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			s1.add(sc.nextInt());
		}
		SetCopy obj = new SetCopy();
		System.out.println(obj.copySets(s1, s2));
		// System.out.println(s2);
	}
}
