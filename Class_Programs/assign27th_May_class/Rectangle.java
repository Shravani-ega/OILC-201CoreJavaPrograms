package assign27th_May_class;

public class Rectangle {
	double length;
	private double breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double getArea() {
		return length * breadth;
	}

	double getPerimeter() {
		return 2 * (length + breadth);
	}

	void display() {
		System.out.println("Area= " + getArea());
		System.out.println("Perimeter= " + getPerimeter());
	}
}