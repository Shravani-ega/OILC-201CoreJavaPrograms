package assign_15th_june;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListToArrayTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the list ");
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter " + size + " Elements");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(50);
//		list.add(45);
//		list.add(74);
//		list.add(33);
		System.out.println("List Elements are :");
		System.out.println(list);
		ListToArray obj = new ListToArray();
		Integer[] array = obj.convertToArray(list);
		System.out.println("Array elements are :");
		for (Integer x : array) {
			System.out.print(x + " ");
		}
	}
}
