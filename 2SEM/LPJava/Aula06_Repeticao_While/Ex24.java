package Aula06_Repeticao_While;
/*
 * 24. Desenvolva um programa em Java que dado um número natural na base binária, transformá-lo
 * para a base decimal. Exemplo: dado 10010 a saída será 18, pois 1. 2 4 + 0. 2 3 + 0. 2 2 + 1. 2 1 +
 * 0. 2 0 = 18.
 */

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe um numero binario positivo: ");
		int bin = in.nextInt();
		int dec = 0, pot2 = 1;
		while (bin > 0) {
			dec += (bin % 10) * pot2;
			bin /= 10;
			pot2 *= 2;
		}
		System.out.println("Numero na base decimal: " + dec);
		in.close();
	}

}
