package Aula06_Repeticao_While;
/*
 * 26. Dizemos que um número natural n é palíndromo se:
 * i) 1o algarismo de n é igual ao seu último algarismo;
 * ii) 2o algarismo de n é igual ao penúltimo algarismo, e assim sucessivamente.
 * Exemplos:
 * • 567765 e 32423 são palíndromos;
 * • 567675 não é palíndromo.
 * Desenvolva um programa em Java que dado um número natural n > 10 , verificar se n é
 * palíndromo.
 */

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inverso = 0, n, copia;
		System.out.print("Informe um numero natural: ");
		copia = n = in.nextInt();
		do {
			inverso = inverso * 10 + n % 10;
			n /= 10;
		} while (n > 0);
		//System.out.println("inverso: " + inverso);
		if (copia == inverso) {
			System.out.printf("%d e' palindromo\n", copia);
		}
		else {
			System.out.printf("%d NAO e' palindromo\n", copia);
		}
		in.close();
	}

}
