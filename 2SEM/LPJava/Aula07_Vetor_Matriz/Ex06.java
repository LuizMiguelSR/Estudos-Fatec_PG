/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Scanner;

/**
 * Criar um programa para entrar com números inteiros em um vetor 
 * a de tamanho 10. Gerar e imprimir o vetor b onde cada elemento é o 
 * quadrado do elemento, na respectiva posição do vetor a.
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int[] veta = new int[10];
        int[] vetb = new int[10];
        System.out.print("Informe os 10 elementos do vetor A: ");
        for (int i = 0; i < 10; i++) {
            veta[i] = in.nextInt();
            vetb[i] = veta[i] * veta[i];
        }
        System.out.print("\nVetor B com elementos ao quadrado: ");
        for (int x = 0; x < 10; x++){
            System.out.print(vetb[x] + " ");
        }
        System.out.println();
        in.close();
    }
    
}
