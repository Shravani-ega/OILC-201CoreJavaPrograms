package arrays_Presentation;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 45, 5, 7 } };
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + 1 + " row elements :");
			for (int j = 0; j < a[i].length; j++) {

				System.out.println(a[i][j]);
			}
		}
	}

}
