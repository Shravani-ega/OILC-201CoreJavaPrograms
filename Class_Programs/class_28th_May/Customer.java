package class_28th_May;

public class Customer {
	static int count;
	String cname;

	Customer(String cname) {
		this.cname = cname;
	}

	void setCount() {
		count++;
	}

	int getCount() {
		return count;
	}

	void display() {
		System.out.println("Customer Name : " + cname);
	}

	public static void main(String[] args) {
		Customer c1 = new Customer("Shravani");
		Customer c2 = new Customer("Srinivas");
		Customer c3 = new Customer("Koushik Raj");
		c1.setCount();
		c1.setCount();
		c1.setCount();
		c2.setCount();
		c2.setCount();
		c3.setCount();
		System.out.println(c1.cname + " " + c1.getCount());
		System.out.println(c2.cname + " " + c2.getCount());
		System.out.println(c3.cname + " " + c3.getCount());

	}

}