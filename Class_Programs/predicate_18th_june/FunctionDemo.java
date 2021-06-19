package predicate_18th_june;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ?");
		Function<String, Integer> f = x -> x.length();
		System.out.println("No of Characters =" + f.apply(sc.next()));
	}
}
