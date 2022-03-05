package Aula06_Repeticao_While;
/*
 * 28. Suponha que em um ano A a população americana é maior que a população brasileira.
 * Sabendo-se que dos Estados Unidos possuem uma taxa de crescimento anual de 2% da sua
 * população e que o Brasil tem crescimento anual de 4%, escreva um programa em Java que
 * dado um ano A e as populações norte-americana e brasileira, determine o ano em que a
 * população brasileira se igualou ou ultrapassou a norte-americana.
 */

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ano, popBrasil, popEUA;
		System.out.print("Informe o ano atual: ");
		ano = in.nextInt();
		System.out.print("Informe a populacao Norte-Americana: ");
		popEUA = in.nextInt();
		System.out.print("Informe a populacao Brasileira: ");
		popBrasil = in.nextInt();
		while (popBrasil <= popEUA) {
			popBrasil += Math.round(popBrasil * 0.04);
			popEUA += Math.round(popEUA * 0.02);
			ano++;
		}
		System.out.printf("Ano em que a populacao Brasileira (%d) ultrapassara' a Norte-Americana (%d): %d\n",
				popBrasil, popEUA, ano);
		in.close();
	}

}
