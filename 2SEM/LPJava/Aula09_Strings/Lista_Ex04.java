package Aula09_Strings;

import java.util.Scanner;

/*
 * 4. Escreva um programa em Java que dadas n strings, determine quantas dessas strings contém
 * uma string qualquer dada pelo usuário.
 */
public class Lista_Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe o numero de string: ");
		int n = in.nextInt(), cont = 0;
		in.nextLine();
		String str, procurada;
		System.out.print("Informe a string procurada: ");
		procurada = in.nextLine();
		System.out.println("Informe " + n  + " strings:");
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "a. string: ");
			str = in.nextLine();
			if (str.contains(procurada)) {
			//if (str.indexOf(procurada) != -1) {
				cont++;
			}
		}
		System.out.println("Numero de ocorrencia de " + procurada + ": " + cont);
		in.close();
	}

}
