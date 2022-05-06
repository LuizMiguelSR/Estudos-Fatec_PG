package Aula07_Vetor_Matriz;

import java.util.Random;
import java.util.Scanner;

/*
 * 23. Criar um programa que carregue uma matriz 12 x 4 com os valores das vendas de uma
 * loja, em que cada linha represente um mês do ano, e cada coluna, uma semana do mês.
 * Calcule e imprima:
 * • O total vendido em cada mês;
 * • O total vendido em cada semana durante todo o ano;
 * • O total vendido no ano.
 */
public class Ex23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		float[][] vendas = new float[12][4];
		float vendasAno = 0;
		System.out.println("Vendas anuais");
		for (int i = 0; i < 12; i++) {
			System.out.printf("Mes %2d: ", i + 1);
			for (int j = 0; j < 4; j++) {
				vendas[i][j] = rand.nextFloat() * 100000;
				System.out.printf("%8.2f\t", vendas[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nTotal vendido em cada mes");
		for (int i = 0; i < 12; i++) {
			float vendasMes = 0;
			for (int j = 0; j < 4; j++) {
				vendasMes += vendas[i][j];
			}
			System.out.printf("Mes %2d: R$ %8.2f\n", i + 1, vendasMes);
			vendasAno += vendasMes;
		}
		
		System.out.println("\nTotal vendido em cada semana");
		for (int j = 0; j < 4; j++) {
			float vendasSemana = 0;
			for (int i = 0; i < 12; i++) {
				vendasSemana += vendas[i][j];
			}
			System.out.printf("Semana %d: R$ %9.2f\n", j + 1, vendasSemana);
		}		
		
		System.out.printf("\nTotal de vendido anualmente: R$ %9.2f\n", vendasAno);
		in.close();
		
	}

}
