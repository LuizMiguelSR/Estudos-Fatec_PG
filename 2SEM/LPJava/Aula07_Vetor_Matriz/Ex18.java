package Aula07_Vetor_Matriz;

import java.util.Random;
import java.util.Scanner;

/*
 * 18. Desenvolva um programa em C para entrar com os valores para uma matriz A n x m . Gerar e
 * imprimir A t . A matriz transposta é gerada trocando linha por coluna.
 */

public class Ex18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int n, m, i, j;
		
		System.out.print("Informe o numero de linha e colunas da matriz: ");
		n = in.nextInt();
		m = in.nextInt();
		
		int[][] a = new int[n][m], at = new int[m][n];
		
		System.out.printf("Matriz original %d x %d\n", n, m);
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				a[i][j] = rand.nextInt(n * m);
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
		
		System.out.printf("\nMatriz transposta %d x %d\n", m, n);
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				at[i][j] = a[j][i];
				System.out.printf("%d\t", at[i][j]);
			}
			System.out.println();
		}
		in.close();
	}

}
