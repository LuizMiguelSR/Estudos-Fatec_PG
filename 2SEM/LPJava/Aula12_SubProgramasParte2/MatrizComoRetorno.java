package Aula12_SubProgramasParte2;

import java.util.Random;
import java.util.Scanner;

public class MatrizComoRetorno {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe o numero de linha e coluna da matriz: ");
		int linhas = in.nextInt(), colunas = in.nextInt();
		System.out.print("Informe o valor limite para os elementos da matriz: ");
		int limite = in.nextInt();
		int[][] mat = criarMatriz(linhas, colunas, limite);		
		imprimirMatriz(mat);
		in.close();
	}

	public static int[][] criarMatriz(int linhas, int colunas, int limite) {
		Random rand = new Random();
		int[][] m = new int[linhas][colunas];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = rand.nextInt(limite);
			}
		}		
		return m;
	}

	public static void imprimirMatriz(int[][] mat) {
		System.out.println("Conteudo da matriz:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("%d\t", mat[i][j]);
			}
			System.out.println();
		}		
	}

}
