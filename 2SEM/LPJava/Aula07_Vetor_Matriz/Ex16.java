package Aula07_Vetor_Matriz;

import java.util.Random;
import java.util.Scanner;

/*
 * 16. Implemente um programa que leia duas matrizes n x n de números reais e gere e escreva
 * uma terceira com os maiores elementos de cada posição entre as duas matrizes.
 */
public class Ex16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int n, i, j;
		System.out.print("Informe a ordem da matriz: ");
		n = in.nextInt();
		double[][] mat1 = new double[n][n], 
				   mat2 = new double[n][n], 
				   mat3 = new double[n][n];
		
		System.out.printf("1a. matriz %d x %d\n", n, n);
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				mat1[i][j] = rand.nextDouble();
				System.out.printf("%.3f\t", mat1[i][j]);
			}
			System.out.println();
		}
		System.out.printf("\n2a. matriz %d x %d\n", n, n);
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				mat2[i][j] = rand.nextDouble();
				System.out.printf("%.3f\t", mat2[i][j]);
			}
			System.out.println();
		}
		
		System.out.printf("\n3a. matriz %d x %d\n", n, n);
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				mat3[i][j] = (mat1[i][j] > mat2[i][j] ? mat1[i][j] : mat2[i][j]);
				System.out.printf("%.3f\t", mat3[i][j]);
			}
			System.out.println();
		}
		in.close();		
	}

}
