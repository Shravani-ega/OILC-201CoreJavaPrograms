package string;

public class StringSplit {

	public static void main(String[] args) {
		String str = "12,3-56,78,9,10-20";
		str = str.replaceAll("-", ",");
		String[] values = str.split(",");
		System.out.println(values.toString());
		
		for (String x : values) {

			System.out.println(x);

		}
		int nums[] = new int[values.length];
		for (int i = 0; i < values.length; i++) {

			nums[i] = Integer.parseInt(values[i]);
		}
		int big = nums[0];
		int small = nums[0];
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > big) {
				big = nums[i];
			}

			if (nums[i] < small) {
				small = nums[i];
			}
		}
		System.out.println("Biggest num is :" + big);
		System.out.println("Smallest num is  :" + small);

		String result = "";

		for (int i = small; i < big; i++) {

			result += i;
			if (i < big) {
				result += " ,";
			}
		}
		System.out.println(result);
	}
}
