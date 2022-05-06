package Aula07_Vetor_Matriz;

import java.util.Scanner;

/*
 * 25. URI 1182 – Coluna da Matriz
 */

public class Ex25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] mat = new double[12][12];
		double soma = 0;
		int c = in.nextInt();
		in.nextLine();
		char t = in.next().charAt(0);
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				mat[i][j] = in.nextDouble();
			}
		}		
		for (int i = 0; i < 12; i++) {
			soma += mat[i][c];
		}
		if (t == 'M') {
			soma /= 12; // média
		}
		System.out.printf("%.1f\n", soma);
		in.close();
	}

}
