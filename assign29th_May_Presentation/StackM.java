package assign29th_May_Presentation;

import java.util.Scanner;

public class StackM {
	static int stack[] = new int[5];
	static int top = -1;

	public static void menu() {
		String m = "menu driven application \n";
		m += "1.push \n";
		m += "2.pop \n";
		m += "3.display \n";
		m += "4.exit \n";
		System.out.println(m);
	}

	private static void push(int ele) {
		if (isFull()) {
			System.out.println("stack is full");
		} else {
			stack[++top] = ele;
			System.out.println("element is inserted");
			// System.out.println("top is "+top);
		}
	}

	private static boolean isFull() {
		boolean b = false;
		if (top == stack.length - 1) {
			b = true;
		}
		return b;
	}

	private static void pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("deleted element is " + stack[top]);
			top--;
		}
	}

	private static boolean isEmpty() {
		boolean b = false;
		if (top == -1) {
			b = true;
		}
		return b;
	}

	private static void display() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("elements are\n");
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			menu();
			System.out.println("choose one option");
			int option = sc.nextInt();
			switch (option) {

			case 1:
				System.out.println("enter an element to insert");
				int ele = sc.nextInt();
				push(ele);
				break;

			case 2:
				pop();
				break;

			case 3:
				display();
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("invalid inputs");

			}
		}
	}
}
