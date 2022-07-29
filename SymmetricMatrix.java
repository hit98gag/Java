package DSA_27th_July;
import java.util.*;
public class SymmetricMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a[][] = { { 2, 3, 6 }, { 3, 4, 5 }, { 6, 5, 9 } };
		int n = a.length;
		int m = a[0].length;
		int b[][] = new int[n][m];
		boolean check = true;
		for (int j = 0; j < m; j++) {

			for (int i = 0; i < n; i++) {
				//System.out.print(a[i][j]);
				b[i][j] = a[j][i];
				
				}
			}
		for (int j = 0; j < m; j++) {

			for (int i = 0; i < n; i++) {
		  if (b[i][j] != a[i][j]) {
			check = false;
		  }
			}
		}
		System.out.println(check);

	}

}
