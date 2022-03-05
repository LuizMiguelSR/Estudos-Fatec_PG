package Aula07_Vetor_Matriz;

import java.util.Scanner;

/*
 * 20. Implemente um programa que exibe um triângulo de Pascal de ordem n, para 1 < n  20.
 * Considere uma matriz quadrada de ordem n, o triângulo de Pascal segue a seguinte regra
 * de formação:
 * • todos os elementos da primeira coluna da matriz são iguais a 1;
 * • todos os elementos da diagonal principal da matriz também são iguais a 1;
 * • para os demais elementos são obtidos pela soma do elemento da mesma coluna na
 * linha de cima com o seu vizinho esquerdo;
 * • os elementos acima da diagonal principal não são exibidos.
 * Abaixo é mostrado um triângulo de Pascal de ordem 5:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */

public class Ex20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Informe a ordem do Triangulo de Pascal: ");
		n = in.nextInt();
		int[][] pascal = new int[n][];
		System.out.println("Triangulo de Pascal de ordem " + n);
		for (int i = 0; i < n; i++) {
			pascal[i] = new int[i + 1];
			for (int j = 0; j < pascal[i].length; j++) {
				if (j == 0 || i == j) { // 1a. coluna ou diagonal principal
					pascal[i][j] = 1;
				}
				else {
					pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
				}
				System.out.printf("%d\t", pascal[i][j]);
			}
			System.out.println();
		}
		in.close();
	}

}
