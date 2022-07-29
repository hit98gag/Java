package DSA_27th_July;

public class SwapARrayRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 2, 3, 6 }, { 3, 4, 5 }, { 6, 5, 9 },{1,6,7} };
		
		int m = a.length;
		int n = a[0].length;
		int r1=0;
		int r2 = 3;

		for (int j=0;j<n;j++) {
			
			int temp =a[r1][j];
			 a[r1][j] = a[r2][j];
			 a[r2][j] = temp;
		}
		
		for(int i=0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
}
}