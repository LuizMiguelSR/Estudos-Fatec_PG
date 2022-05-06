package Aula07_Vetor_Matriz;

import java.util.Random;
import java.util.Scanner;

/*
 * 22. O produto de uma matriz por outra não é determinado por meio do produto dos seus
 * respectivos elementos. Assim, o produto das matrizes A = (a i j ) m x p e B = (b i j ) p x n é a matriz
 * C = (c i j ) m x n em que cada elemento c ij é obtido por meio da soma dos produtos dos
 * elementos correspondentes da i-ésima linha de A pelos elementos da j-ésima coluna B.
 * Escreva um programa que dadas duas matrizes A m x p e B p x n gera e imprima a matriz C m x n
 * obtida através da multiplicação das matrizes A e B. Note que o produto de duas matrizes
 * só pode ser computado se o número de colunas da primeira matriz for igual ao número de
 * linhas da segunda.
 */

public class Ex22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int n, p1, p2, m;
		System.out.print("Informe o numero de linhas e colunas da 1a. matriz: ");
		n = in.nextInt();
		p1 = in.nextInt();
		System.out.print("\nInforme o numero de linhas e colunas da 2a. matriz: ");
		p2 = in.nextInt();
		m = in.nextInt();
		
		if (p1 != p2) {
			System.out.println("Nao e' possivel fazer o produto das matrizes, pois o numero de colunas da 1a. não e' igual ao numero de linhas da 2a.\n");
		}
		else {
			int[][] a = new int[n][p1], b = new int[p2][m], c = new int[n][m];
			System.out.printf("\nMatriz A %d x %d:\n", n, p1);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < p1; j++) {
					a[i][j] = rand.nextInt(n * p1);
					System.out.printf("%d\t", a[i][j]);
				}
				System.out.println();
			}
			System.out.printf("\nMatriz B %d x %d:\n", p2, m);
			for (int i = 0; i < p2; i++) {
				for (int j = 0; j < m; j++) {
					b[i][j] = rand.nextInt(n * p1);
					System.out.printf("%d\t", b[i][j]);
				}
				System.out.println();
			}

			System.out.printf("\nMatriz C %d x %d:\n", n, m);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					for (int k = 0; k < p1; k++) {
						c[i][j] += a[i][k] * b[k][j];						
					}
					System.out.printf("%d\t", c[i][j]);
				}
				System.out.println();
			}
		}
		in.close();
	}

}
