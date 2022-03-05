package Aula06_Repeticao_While;
/*
 * 27. Uma pessoa aplicou um capital de x reais a juros mensais de z durante 1 ano. Desenvolva um
 * programa em Java para determinar o montante de cada mês durante este período.
 */

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float x, z;
		System.out.print("Informe o capital aplicado: R$ ");
		x = in.nextFloat();
		System.out.print("Informe a taxa de juros (%): ");
		z = in.nextFloat();
		z /= 100;
		for (int i = 1; i <= 12; i++) {
			x += x * z;
			System.out.printf("Montante apos o mes %d: R$ %.2f\n", i, x);
		}
		in.close();
	}

}
