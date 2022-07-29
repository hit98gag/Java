package DSA_27th_July;
import java.util.*;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {

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
}
}