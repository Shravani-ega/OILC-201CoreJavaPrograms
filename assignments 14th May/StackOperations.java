package assign14thMay;

import java.util.Scanner;

public class StackOperations {

	static int stack[] = new int[5];
	static int top = -1;

	static void menu() {
		String m = "Stack operations on Array\n";
		m += "1.Push-\n";
		m += "2.Pop-\n";
		m += "3.Display \n";
		m += "4.Exit\n";
		m += "Choose any Option";
		System.out.println(m);
	}

	static void push(int ele) {

		if (isFull()) {

			System.out.println("Stack is overflow ");
		} else {
			stack[++top] = ele;
			System.out.println("Element is added");
		}
	}

	static void pop() {

		if (isEmpty()) {
			System.out.println("Stack is empty ");
		} else {
			System.out.println("Deleted element " + stack[top]);
			top--;
		}
	}

	static boolean isEmpty() {
		boolean b = false;
		if (top == -1) {
			b = true;

		}
		return b;
	}

	static boolean isFull() {
		boolean b = false;
		if (top == stack.length - 1) {
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		for (;;) {
			menu();
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				accept();
				push(scanner.nextInt());
				break;
			case 2:
				pop();
				break;

			case 3:
				display();
				break;
			case 4:
				System.exit(0);

			}
		}
	}

	static void accept() {
		System.out.println("Enter element to insert ? ");
	}

	static void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Queue Elements are as follows :");
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
}
