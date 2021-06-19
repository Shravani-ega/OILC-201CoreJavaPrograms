package assign_16th_june;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class PalindomeUsingStack {
	static String isPalindrome(String str) {
		String res = "";
		String result = "";
		char[] charArray = str.toCharArray();
		Stack stack = new Stack();

		for (int i = 0; i < charArray.length; i++) {
			stack.push(charArray[i]);
		}
		for (int i = 0; i < stack.size(); i++) {
			result += stack.pop();
			i--;
		}
		if (str.equalsIgnoreCase(result)) {
			res += "palindrome";
		} else {
			res += "Not Palindrome";
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		System.out.println(isPalindrome(sc.next()));
	}

}
