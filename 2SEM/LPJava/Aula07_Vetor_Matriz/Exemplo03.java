/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Random;

/**
 * Escreva um programa em Java que preencha uma matriz de inteiros 
 * n x m com valores aleatório (use a classe Random), 
 * imprima esta matriz e calcule e imprima o somatório dos 
 * elementos da matriz.
 */
public class Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int i, j, som=0;
        int[][] matriz = new int[rand.nextInt(5)][rand.nextInt(5)];
        for ( i = 0; i < matriz.length; i++ ) {
            for ( j = 0; j < matriz.length; j++) {
                matriz[i][j]=rand.nextInt(20);
                System.out.print(matriz[i][j] + "\t");
                som += matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("O somátorio é "+som);
    }
    
}
