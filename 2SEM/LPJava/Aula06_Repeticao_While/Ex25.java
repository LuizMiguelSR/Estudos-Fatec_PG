package Aula06_Repeticao_While;
/*
 * 25. Desenvolva um programa em Java que dado um número natural na base decimal, transformá-lo
 * para a base binária. Exemplo: Dado 18 a saída deverá ser 10010.
 */

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe um numero na base decimal: ");
		int dec = in.nextInt();
		long bin = 0, pot10 = 1;
		while (dec > 0) {
			bin += (dec % 2) * pot10;
			dec /= 2;
			pot10 *= 10;
		}
		System.out.println("Numero na base binaria: " + bin);
		in.close();
	}

}
