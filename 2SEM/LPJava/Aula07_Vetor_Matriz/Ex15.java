package Aula07_Vetor_Matriz;

/*
 * 15. Escreva um programa que declare uma matriz 10 x 10. Preencha com 1 a diagonal
 * principal e com 0 os demais elementos. Escreva ao final a matriz obtida.
 */

public class Ex15 {

	public static void main(String[] args) {
		int[][] mat = new int[10][10];
		for (int i = 0; i < 10; i++) {
			mat[i][i] = 1;
		}
		System.out.println("Matriz identidade de ordem 10:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
