package Aula05_Repeticao_While;

import java.util.Scanner;

/*
 * 20. Considere n inteiro positivo, dizemos que n é perfeito se for igual à soma de seus divisores
 * positivos diferentes de n. Exemplo: 6 é perfeito, pois 1+2+3 = 6. Desenvolva um programa em
 * Java, que dado um inteiro positivo m, determinar quantos números perfeitos há entre 1 e m.
 */
public class Ex20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m, n, soma, cont = 0;
		System.out.print("Informe um numero inteiro: ");
		m = in.nextInt();
		System.out.printf("Numeros perfeitos entre 1 e %d: ", m);
		for (n = 1; n <= m; n++) {
			soma = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					soma += i;
				}
			}
			if (soma == n) {
				System.out.print(n + " ");
				cont++;
			}
		}
		System.out.printf("\nHa' %d numero(s) perfeito(s) entre 1 e %d\n", cont, m);
		in.close();
	}

}
