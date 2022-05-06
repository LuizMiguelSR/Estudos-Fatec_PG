package Aula06_Repeticao_While;

import java.util.Scanner;

/*
 * 23. A série de Ricci difere da série de Fibonacci porque os dois primeiros termos são fornecidos
 * pelo usuário. Os demais termos são gerados da mesma forma que a série de Fibonacci. Criar
 * um programa em Java que imprima os n primeiros termos da série de Ricci e a soma dos
 * termos impressos, sabendo-se que para existir esta série serão necessários pelo menos três
 * termos.
 */

public class Ex23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r1, r2, rn, soma = 0;
		System.out.print("Informe os 2 primeiros termos da serie de Ricci: ");
		r1 = in.nextInt();
		r2 = in.nextInt();
		System.out.print("Informe o numero de termos da serie de Ricci (min. 3): ");
		n = in.nextInt();
		while (n < 3) {
			System.out.print("Informe o numero de termos da serie de Ricci (min. 3): ");
			n = in.nextInt();			
		}
		soma = r1 + r2;
		System.out.printf("%d primeiros termos da serie de Ricci: %d %d", n, r1, r2);
		for (int i = 3; i <= n; i++) {
			rn = r2 + r1;
			System.out.printf(" %d", rn);
			soma += rn;
			r1 = r2;
			r2 = rn;
		}
		System.out.printf("\nSoma dos %d termos da serie de Ricci: %d\n", n, soma);
		in.close();
	}

}
