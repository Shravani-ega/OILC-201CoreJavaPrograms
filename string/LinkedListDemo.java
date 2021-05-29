package string;

import java.util.Scanner;

public class LinkedListDemo {

	static Node head = null;

	public static void create(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		if (head == null) {

			head = temp;
		} else {
			Node p = head;
			while (p.link != null) {

				p = p.link;
			}
			p.link = temp;
		}

	}

	public static void print() {

		Node temp = head;
		if (temp == null) {
			System.out.println("No elements are present :");

		} else {
			while (temp.link != null) {

				System.out.println(temp.data);
				temp = temp.link;
			}
			System.out.println(temp.data);
		}
	}

	public static int Length() {
		int count = 0;
		Node temp = head;
		if (temp == null) {
			System.out.println("No elemets are present ");
		} else {
			while (temp.link != null) {
				count++;
				temp = temp.link;

			}
			count++;
		}
		return count;
	}

	public static void addAtabegin(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		if (head == null) {
			head = temp;
		} else {
			temp.link = head;
			head = temp;

		}
	}

	public static void addAfter(int loc, int data) {
		Node p;
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		if (loc > Length()) {
			System.out.println("Invlid location ");
		} else {
			int i = 1;
			p = head;
			while (i < loc--) {
				p = p.link;

				i++;
			}
			temp.link=p.link;

			p = temp;
		}

	}

	public static void menu() {
		String m = "Menu Driven Application \n";
		m += "1.Add Element \n";
		m += "2.Display Elements \n";
		m += "3.No of Elements \n";
		m += "4.Add at begin \n";
		m += "5.Delete \n";
		m += "6.Add at specific location \n";
		m += "7.Exit \n";
		m += "Select any option ?";
		System.out.println(m);
	}

	public static void delete(int loc) {
		Node temp = head;
		if (loc > Length()) {
			System.out.println("invalid location");

		} else if (loc == 1) {
			temp = head;
			head = temp.link;
			temp.link = null;
			System.out.println("Deleted element is  " + temp.data);

		} else {
			Node p, q;
			p = head;
			int i = 1;
			while (i < loc--) {
				p = p.link;
				i++;
			}
			q = p.link;
			p.link = q.link;
			q.link = null;
			System.out.println("Deleted element is = " + q.data);
		}
	}

	public static void accept() {
		System.out.println("Enter any value?");
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		while (true) {
			menu();
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				accept();
				create(scanner.nextInt());
				break;

			case 2:
				print();
				break;
			case 3:
				System.out.println(Length());
				break;
			case 4:
				accept();
				addAtabegin(scanner.nextInt());
				break;
			case 5:
				System.out.println("Enter any value :");
				delete(scanner.nextInt());
				break;
			case 6:
				System.out.println("Enter location , data ?");
				addAfter(scanner.nextInt(), scanner.nextInt());
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Invalid Option :");

			}
		}

	}
}

class Node {
	int data;
	Node link;

	Node() {

		this.link = null;
	}
}
