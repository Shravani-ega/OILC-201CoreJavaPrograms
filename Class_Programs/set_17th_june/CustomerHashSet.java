package set_17th_june;

import java.util.HashSet;
import java.util.Iterator;

class Customer {

	int cno;
	String cname;

	public Customer(int cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}

	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + "]";
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + cno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (cno != other.cno)
			return false;
		return true;
	}

}

public class CustomerHashSet {

	public static void main(String[] args) {
		HashSet<Customer> hs = new HashSet<Customer>();
		Customer c1 = new Customer(1, "Raj");
		Customer c2 = new Customer(2, "Ramu");
		Customer c3 = new Customer(1, "AAA");
		Customer c4 = new Customer(7, "Rani");
		Customer c5 = new Customer(6, "Sita");
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		hs.add(c5);

		Iterator<Customer> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
