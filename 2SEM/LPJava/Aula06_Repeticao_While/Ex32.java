package Aula06_Repeticao_While;

import java.util.Scanner;

/*
 *32. A CBF está preocupada com o excesso de peso e a idade avançada de alguns jogadores da
 * seleção brasileira de futebol, e lhe contratou para escrever um programa que dados o peso e a
 * idade dos 11 titulares da seleção, determine e imprima:
 * i) o peso e a idade média dos titulares da seleção;
 * ii) o maior peso entre todos os titulares;
 * iii) a maior idade entre todos os titulares.
 */

public class Ex32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int peso, idade, maiorPeso = 0, maiorIdade = 0;
		float pesoMedio = 0, idadeMedia = 0;
		System.out.println("Informe o peso e a idade dos 11 titulares da selecao brasileira de futebol:");
		for (int i = 1; i <= 11; i++) {
			System.out.printf("%do. jogador:\nPeso: ", i);
			peso = in.nextInt();
			System.out.print("Idade: ");
			idade = in.nextInt();
			pesoMedio += peso;
			idadeMedia += idade;
			if (peso > maiorPeso) {
				maiorPeso = peso;
			}
			if (idade > maiorIdade) {
				maiorIdade = idade;
			}
		}
		pesoMedio /= 11;
		idadeMedia /= 11;
		System.out.printf("Peso medio: %.1f Kg\n", pesoMedio);
		System.out.printf("Idade media: %.1f Kg\n", idadeMedia);
		System.out.printf("Maior peso: %d Kg\n", maiorPeso);
		System.out.printf("Maior idade: %d anos\n", maiorIdade);		
		in.close();
	}

}
