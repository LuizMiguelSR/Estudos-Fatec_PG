/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Scanner;

/**
 *Dada uma sequência de  n  números inteiros, determinar qual é a maior 
 * subsequência crescente nesta sequência. Por exemplo, seja n = 8, a sequência
 * 5, 7, -1, 0 , 3, 6, 6, 4, então a maior sequência crescente é -1, 0, 3, 6.
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	Scanner in = new Scanner(System.in);
	int n, tamMaior = 1, indexMaior = 0, tamAtual = 1, indexAtual = 0;
	System.out.print("Informe o tamanho da sequencia de inteiros: ");
	n = in.nextInt();
	int[] seq = new int[n];
        System.out.print("Informe " + n + " numeros inteiros: ");
	for (int i = 0; i < n; i++) {
            seq[i] = in.nextInt();
	}

	for (int i = 1; i < n; i++) {
            if (seq[i] > seq[i - 1]) {
		tamAtual++;
		if (tamAtual > tamMaior) {
                    tamMaior = tamAtual;
                    indexMaior = indexAtual;
		}
            }
            else {
		indexAtual = i;
		tamAtual = 1;
            }
	}
            System.out.print("Maior sequencia crescente: ");
	for (int i = indexMaior; i < indexMaior + tamMaior; i++) {
            System.out.print(seq[i] + " ");
	}
	System.out.println();
	in.close();
    }
    
}
