package Aula07_Vetor_Matriz;

import java.util.Scanner;

/*
 * 13. URI 2162 – Picos e Vales
 */

public class Ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = in.nextInt();
		}
		int saida = 1;
		if (h[1] != h[0]) {
			boolean pico = h[1] < h[0];
			for (int i = 2; i < n && saida == 1; i++) {
				if (pico && h[i] <= h[i - 1]) {
					saida = 0;
				}
				else if (!pico && h[i] >= h[i - 1]) {
					saida = 0;
				}
				pico = !pico;
			}					
		}
		else {
			saida = 0;
		}
		System.out.println(saida);
		in.close();
	}

}
