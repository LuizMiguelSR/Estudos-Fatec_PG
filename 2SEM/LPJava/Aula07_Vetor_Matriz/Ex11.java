package Aula07_Vetor_Matriz;

/*
 * 11. URI 1175 – Troca em Vetor I
 */

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int[20];
		int i, aux;
		for (i = 0; i < 20; i++) {
			n[i] = in.nextInt();
		}
		for (i = 0; i < 10; i++) {
			aux = n[i];
			n[i] = n[19 - i];
			n[19 - i] = aux;
		}
		for (i = 0; i < 20; i++) {
			System.out.printf("N[%d] = %d\n", i, n[i]);
		}
		in.close();
	}

}
