/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Scanner;

/*
 * 5. Criar um programa que leia o preço de compra e o preço de venda de n mercadorias
 * usando um vetor para cada um dos preços. O programa deverá imprimir quantas
 * mercadorias proporcionam:
 * a) Lucro < 10%
 * b) 10 % <= Lucro <= 20%
 * c) Lucro > 20%
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	Scanner in = new Scanner(System.in);
		
	int n, lucroMenor10 = 0, lucro10e20 = 0, lucroMaior20 = 0;
	System.out.print("Informe o numero de mercadorias: ");
	n = in.nextInt();
	float[] compra = new float[n], venda = new float[n];
	float lucro, percLucro;
	System.out.println("Informe o preco de compra e venda das " + n + " mercadorias:");
	for (int i = 0; i < n; i++) {
		System.out.println((i + 1) + "a. mercadoria:");
		System.out.print("Preco de Compra: R$ ");
		compra[i] = in.nextFloat();
		System.out.print("Preco de venda: R$ ");
		venda[i] = in.nextFloat();
	}
		
	for (int i = 0; i < n; i++) {
		lucro = venda[i] - compra[i];
		percLucro = (lucro / compra[i]) * 100; 
		if (percLucro < 10) {
			lucroMenor10++;
		}
		else if (percLucro <= 20) {
			lucro10e20++;
		}
		else {
			lucroMaior20++;
		}
	}
	System.out.println("Quantidade de marcadorias com lucro menor que 10%: " + lucroMenor10);
	System.out.println("Quantidade de marcadorias com lucro entre 10% e 20%: " + lucro10e20);
	System.out.println("Quantidade de marcadorias com lucro maior que 20%: " + lucroMaior20);
	in.close();
	} 
}
