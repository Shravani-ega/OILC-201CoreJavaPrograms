package string;

public class TwoDArryasMul {

	public static void main(String[] args) {
		
		    int[][]a= {{2,3},{4,5}};
		    int[][] b= {{3,5},{1,4}};
		
			int[][] mul = new int[2][2];

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					
					for (int k = 0; k < 2; k++) {

						 mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
					}
				}
			}
			for(int i=0;i<mul.length;i++) {
				
				
				
				for(int j=0;j<mul[i].length;j++) {
					
					System.out.print(mul[i][j]+" ");
				}
				System.out.println();
			}

	
	}

}
