package Aula12_SubProgramasParte2;
/*
 * 4. Escreva um programa em Java que use um método que recebe um vetor de strings como
 * parâmetro e devolve verdadeiro se o vetor está em ordem alfabética (crescente), ou falso,
 * caso contrário.
 */
import java.util.Scanner;

public class Lista_Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Informe o numero de strings: ");
		n = in.nextInt();
		in.nextLine();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("%da. string: ", i + 1);
			strings[i] = in.nextLine();
		}
		if (estaOrdenado(strings)) {
			System.out.println("As strings estao em ordem alfabetica");
		}
		else {
			System.out.println("As strings NAO estao em ordem alfabetica");
		}
		in.close();
	}

	public static boolean estaOrdenado(String[] strings) {
		for (int i = 1; i < strings.length; i++) {
			if (strings[i-1].compareToIgnoreCase(strings[i]) > 0) {
				return false;
			}
		}
		return true;
	}

}
