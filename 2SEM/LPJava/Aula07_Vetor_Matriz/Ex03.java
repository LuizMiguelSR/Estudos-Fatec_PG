/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Scanner;

/**
 * Exercício 03: Desenvolva um programa para armazenar 10 números 
 * inteiros em um vetor e imprimir uma listagem numerada contendo 
 * o número e umas das mensagens: par ou ímpar, para cada elemento 
 * do vetor
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.print("Informe os 10 elementos do vetor: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = in.nextInt();
        }
        System.out.println("Listagem numerada: ");
        for (int x = 0; x < vetor.length; x++) {
            if (vetor[x]%2==0){
                System.out.println("O número "+vetor[x]+" é par.");
            } else {
                System.out.println("O número "+vetor[x]+" é ímpar.");
            }
        }

    }
    
}
