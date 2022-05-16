package Aula07_Vetor_Matriz;

import java.util.Scanner;

/*
 * 21. Criar um programa que deixe entrar com valores para uma matriz de ordem n e verifique
 * se ela é ou não uma matriz identidade. Matriz identidade é aquela em que todos os
 * elementos da diagonal principal são iguais a 1 e os demais elementos são iguais a 0.
 */
public class Ex21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe a ordem da matriz: ");
		int n = in.nextInt();
		int[][] mat = new int[n][n];
		boolean identidade = true;
		System.out.printf("Informe os elementos da matriz %d x %d\n", n, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < n && identidade; i++) {
			for (int j = 0; j < n && identidade; j++) {
				if (i == j && mat[i][j] != 1) {
					identidade = false;
				}
				else if (i != j && mat[i][j] != 0) {
					identidade = false;
				}
			}
		}
		if (identidade) {
			System.out.println("A matriz e' identidade");
		}
		else {
			System.out.println("A matriz NAO e' identidade");
		}
		in.close();
	}

}
