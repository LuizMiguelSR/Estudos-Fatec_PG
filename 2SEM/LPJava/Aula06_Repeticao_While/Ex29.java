package Aula06_Repeticao_While;
/*
 * 29. Desenvolva um programa em Java que imprima a tabela de multiplicação (de 1 a 10) para os
 * números inteiros no intervalo de 3 a 9.
 */

public class Ex29 {

	public static void main(String[] args) {
		for (int i = 3; i <= 9; i++) {
			System.out.println("\nTabela de multiplicacao do " + i);
			for (int j = 0; j <= 10; j++) {
				System.out.printf("%d x %2d = %2d\n", i, j, i * j);
			}
		}
	}

}
