package Aula05_Repeticao_While;

import java.util.Scanner;

/*
 * 22. Um matemático italiano da idade média conseguiu modelar o ritmo de crescimento da
 * população de coelhos através de uma sequência de números naturais que passou a ser
 * conhecida como sequência de Fibonacci. O n-ésimo número da sequência de Fibonacci F n é
 * dado pela seguinte fórmula de recorrência:
 * F 1 = 1
 * F 2 = 1
 * F i = F i-1 + F i-2 para i > 2
 * Faça um programa em Java que dado n calcula F n .
 */

public class Ex22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Informe a ordem do termo da serie de Fibonacci: ");
		n = in.nextInt();
		if (n < 3) {
			System.out.printf("O termo de Fibonacci de ordem %d: 1\n", n);
		}
		else {
			int f1 = 1, f2 = 1, fn = f2 + f1;
			for (int i = 4; i <= n; i++) {
				f1 = f2;
				f2 = fn;
				fn = f2 + f1;
			}
			System.out.printf("O termo de Fibonacci de ordem %d: %d\n", n, fn);
		}
		in.close();
	}

}
