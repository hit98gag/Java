package DSA_27th_July;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int m1 = input.nextInt();
		int n1 = input.nextInt();
		int sum = 0;
		int a[][] = new int[m1][n1];

		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {

				a[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < m1; i++) {

			for (int j = 0; j < n1; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int count = 0;
		
		for (int i = 0; i < m1; i++) {

			for (int j = 0; j < n1; j++) {

				if (a[i][j] == 0) {

					count++;
				}

			}
		}

		if (count > (m1*n1) / 2) {

			System.out.println("Sparse");

		} else {
			System.out.println("Not Sparse");
		}
	}
}
