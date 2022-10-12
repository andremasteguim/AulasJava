package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas linhas a matriz terá: ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas a matriz terá: ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println("Digite os valores da Matriz:");

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Digite um numero X: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(mat[i][j] != mat[i][n-1]) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(mat[i][j] != mat[m-1][j]) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}


		sc.close();
	}

}
