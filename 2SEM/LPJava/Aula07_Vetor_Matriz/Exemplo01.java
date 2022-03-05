package Aula07_Vetor_Matriz;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiz Miguel
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        int n = in.nextInt();
        int[] vetor = new int[n];
        System.out.println("Informe os "+n+" elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = in.nextInt();
        }
        System.out.println("Vetor em ordem inversa: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        in.close();
    }
    
}
