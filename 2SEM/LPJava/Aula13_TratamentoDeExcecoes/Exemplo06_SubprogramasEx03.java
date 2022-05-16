package Aula13_TratamentoDeExcecoes;

import java.util.Scanner;

public class Exemplo06_SubprogramasEx03 {
	public static void main(String[] args) {
		double[] notas = new double[3];
		char letra;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite as três notas: ");
		for (int i = 0; i < 3; i++) {
			notas[i] = in.nextDouble();
		}
		in.nextLine();
		System.out.print("Digite a letra: ");
		letra = in.nextLine().charAt(0);
		in.close();
		try {
			System.out.print("A média das notas: " + calcularMedia(notas, letra));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static double calcularMedia(double[] notas, char letra) {
		double soma = 0;
		double media = 0;
		if (letra == 'A' || letra == 'a') {
			for (int i = 0; i < 3; i++) {
				soma += notas[i];
			}
			media = soma / 3;
		} else if (letra == 'P' || letra == 'p') {
			media = (notas[0] * 5 + notas[1] * 3 + notas[2] * 2) / 10;
		} else {
			throw new IllegalArgumentException("A letra deve ser A ou P");
		}		
		return media;
	}
}
