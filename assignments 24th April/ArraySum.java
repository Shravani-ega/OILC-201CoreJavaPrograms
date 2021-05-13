package assign24thApril;

class FindSum {

public static int getSum(int[] arr) {
	int sum = 0;
	if(arr.length!=0) {
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	}else {
		return -1;
	}
	return sum;
}
}

public class ArraySum {

	public static void main(String args[]) {
		try {
		int[] arr = new int[20];

		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}

		System.out.println("sum values"+FindSum.getSum(arr));
		}catch(Exception e) {
			System.err.println("Error");
		}
	}

}
