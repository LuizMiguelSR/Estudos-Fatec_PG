package Aula07_Vetor_Matriz;

import java.util.Scanner;

/*
 * 19. Escreva um programa em C que dada uma matriz quadrada de ordem n de inteiros,
 * determina se a matriz é triangular superior ou não. Matriz triangular superior é uma
 * matriz onde todos os elementos de posições acima da diagonal principal são diferentes de
 * 0 e todos os elementos demais elementos são iguais a 0.
 */

public class Ex19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		boolean triangSup = true;
		System.out.print("Informe a ordem da matriz: ");
		n = in.nextInt();		
		int[][] mat = new int[n][n];
		
		System.out.printf("Informe os elementos da matriz %d x %d:\n", n, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < n && triangSup; i++) {
			for (int j = 0; j < n && triangSup; j++) {
				if (j > i) { // acima da diagonal principal
					if (mat[i][j] == 0) {
						triangSup = false;
					}
				}
				else { // da diagonal principal para baixo
					if (mat[i][j] != 0) {
						triangSup = false;
					}
				}
			}
		}
		
		if (triangSup) {
			System.out.println("A matriz e' triangular superior");
		}
		else {
			System.out.println("A matriz NAO e' triangular superior");
		}
		in.close();
	}

}
