package collections_14thjune;

public class Demo<T> {
	T num;

	Demo(T num) {
		this.num = num;
	}

	T getNum() {
		return num;
	}

	public static void main(String[] args) {
		Demo<Integer> obj = new Demo<Integer>(10);
		System.out.println(obj.getNum());
		Demo<Float> obj1 = new Demo<Float>(10.56f);
		System.out.println(obj1.getNum());
		Demo<String> obj2 = new Demo<String>("Ojas");
		System.out.println(obj2.getNum());
	}
}
