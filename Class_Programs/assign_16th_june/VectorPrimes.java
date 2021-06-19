package assign_16th_june;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorPrimes {
	static Vector<Integer> rangePrimeNumbers(int start, int end) {
		Vector<Integer> primes = new Vector<Integer>();
		for (int num = start; num <= end; num++) {
			int count = 0;
			for (int i = 2; i < num / 2; i++) {
				if ((num % i) == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				primes.addElement(num);
			}
		}
		return primes;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start value");
		int start = sc.nextInt();
		System.out.println("Enter end value");
		int end = sc.nextInt();
		Vector<Integer> res = rangePrimeNumbers(start, end);
		Enumeration<Integer> e = res.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
