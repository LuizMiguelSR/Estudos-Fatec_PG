package Aula07_Vetor_Matriz;

import java.util.Random;

public class Ex17 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] a = new int[4][4], b = new int[4][4], soma = new int[4][4];
		System.out.println("Matriz A 4x4:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = rand.nextInt(100);
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nMatriz B 4x4:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				b[i][j] = rand.nextInt(100);
				System.out.printf("%d\t", b[i][j]);
				soma[i][j] = a[i][j] + b[i][j];
			}
			System.out.println();
		}
		System.out.println("\nMatriz Soma 4x4:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = rand.nextInt(100);
				System.out.printf("%d\t", soma[i][j]);
			}
			System.out.println();
		}
	}

}
