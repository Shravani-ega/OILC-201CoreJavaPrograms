package set_17th_june;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ?");
		String name = sc.next();
		Predicate<String> p = x -> x.length() >= 5;
		System.out.println(p.test(name));
	}
}
