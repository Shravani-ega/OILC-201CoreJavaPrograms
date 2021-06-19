package predicate_18th_june;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Product2 {

	private int pid;
	private String name;
	private double price;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product2(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
}

public class ProductPredicate {

	public static void main(String[] args) {

		List<Product2> list = new ArrayList<Product2>();
		Product2 p1 = new Product2(1, "Pen", 50);
		Product2 p2 = new Product2(1, "AC", 40000);
		Product2 p3 = new Product2(1, "Fridze", 20000);
		Product2 p4 = new Product2(1, "Cooler", 10000);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		Predicate<Product2> product = (Product2 p) -> p.getPrice() > 30000;
		System.out.println("Above 300000 :");
		m1(product, list);
	}

	public static void m1(Predicate<Product2> product, List<Product2> list) {
		for (Product2 m : list) {
			if (product.test(m)) {
				System.out.println(m);
			}
		}
	}
}
