package Aula09_Strings;

import java.util.Scanner;

public class Exercicio03_Nome_Completo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nomeCompleto;
		int i;
		System.out.println("Informe seu nome completo: ");
		nomeCompleto = in.nextLine();
		
		//for (i = nomeCompleto.length() - 1; i >= 0 && nomeCompleto.charAt(i) != ' '; i--);
		
		
		// imprime o último sobrenome
		/*
		for (int j = i + 1; j < nomeCompleto.length(); j++) {
			System.out.print(nomeCompleto.charAt(j));
		}
		*/
		
		i = nomeCompleto.lastIndexOf(' ');
		System.out.print(nomeCompleto.substring(i + 1));
		
		System.out.print(", ");
		
		i = nomeCompleto.indexOf(' ');
		System.out.println(nomeCompleto.substring(0, i));
		
		// imprime o 1o. nome
		/*
		for (int j = 0; j < nomeCompleto.length() && nomeCompleto.charAt(j) != ' '; j++) {
			System.out.print(nomeCompleto.charAt(j));
		}
		System.out.println();
		*/
		in.close();
	}

}
