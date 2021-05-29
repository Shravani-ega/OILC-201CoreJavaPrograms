package constructors;

class Car {
	String cname;

	Car() {
		cname = "Maruthi";
		System.out.println("Default Constructor");

	}

	void Car() {
		System.out.println("Welcome " + cname);
	}
}

public class CarExample {

	public static void main(String[] args) {
		Car obj = new Car();
	}

}
