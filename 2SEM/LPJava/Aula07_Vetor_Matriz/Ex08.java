/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Random;
import java.util.Scanner;

/**
 *Tentando descobrir se um dado era viciado, um dono de cassino o 
 * lançou n vezes. Dados os n resultados dos lançamentos, determinar 
 * o número de ocorrências de cada face.
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Informe número de vezes lançado: ");
        int n = in.nextInt();
        int[] dado = new int[n];
        int v1=0, v2=0, v3=0, v4=0, v5=0, v6=0;
        System.out.print("\nValores obtidos: ");
        for (int i = 0; i < n; i++) {
            dado[i] = rand.nextInt(6)+1;
            System.out.print(dado[i]+" ");
            if (dado[i] == 1) {
                v1++;
            } else if (dado[i] == 2) {
                v2++;
            } else if (dado[i] == 3) {
                v3++;
            } else if (dado[i] == 4) {
                v4++;
            } else if (dado[i] == 5) {
                v5++;
            } else {
                v6++;
            }
        }
        System.out.println();
        System.out.println("\nO número de vezes que caiu 1 foi: "+v1);
        System.out.println("O número de vezes que caiu 2 foi: "+v2);
        System.out.println("O número de vezes que caiu 3 foi: "+v3);
        System.out.println("O número de vezes que caiu 4 foi: "+v4);
        System.out.println("O número de vezes que caiu 5 foi: "+v5);
        System.out.println("O número de vezes que caiu 6 foi: "+v6);
    }
    
}
