package assign24thApril;

class Multiple {
	public static int[] getMultiplesArray(int num) {
		int[] a = new int[11];
		for (int i = 1; i < a.length; i++) {

			a[i] = i * num;

			System.out.println(a[i]);
		}
		return a;
	}
}

public class FillMultiples {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);
			if (num > 0) {
				int b[]=Multiple.getMultiplesArray(num);
				for(int i=0;i<b.length;i++) {
					System.out.println(b[i]);
				}
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.err.println("Error" + e);
		}
	}
}
