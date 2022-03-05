package Aula09_Strings;

import java.util.Scanner;

public class Lista_Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe um texto: ");
		String texto = in.nextLine().toLowerCase();
		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		int[] cont = new int[5];
		for (int i = 0; i < texto.length(); i++) {
			for (int j = 0; j < vogais.length; j++) {
				if (texto.charAt(i) == vogais[j]) {
					cont[j]++;
					break;
				}
			}
		}
		// exibir histograma de frequencia
		System.out.println("Histograma de frequencia das vogais");
		for (int i = 0; i < 5; i++) {
			System.out.print(vogais[i] + ": ");
			for (int j = 1; j <= cont[i]; j++) {
				System.out.print('*');
			}
			System.out.println(" (" + cont[i] + ")");
		}
		in.close();
	}

}
