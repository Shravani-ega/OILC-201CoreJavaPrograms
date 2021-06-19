package assign_15th_june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ArrayToList {
	List<String> convertToList(String[] array) {
		List<String> list = new ArrayList<String>(array.length);
		list = Arrays.asList(array);
		if (array.length == 0 || list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}
}
public class ArrayToListChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the array ");
		int size = sc.nextInt();
		String[] array = new String[size];
		System.out.println("Enter " + size + " elements ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.next();
		}
		ArrayToList obj = new ArrayToList();
		List<String> list = obj.convertToList(array);
		list.forEach(x->System.out.println(x));//using custom
		System.out.println(list);
	}
}
