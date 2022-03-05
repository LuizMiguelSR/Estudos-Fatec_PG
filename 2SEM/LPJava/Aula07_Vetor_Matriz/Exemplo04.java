/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Random;

/**
 *Escreva um programa em Java que preencha uma matriz de reais n x m 
 * com valores aleatório (use a classe Random), imprima esta matriz 
 * e determine e imprima a posição (linha e coluna) do maior elemento 
 * da matriz.
 */
public class Exemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int i, j, lin=0, col=0, maior=0;
        int[][] matriz = new int[5][5];
        for ( i = 0; i < matriz.length; i++ ) {
            for ( j = 0; j < matriz.length; j++) {
                matriz[i][j]=rand.nextInt(20);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for ( i = 0; i < matriz.length; i++ ) {
            for ( j = 0; j < matriz.length; j++) {
                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                } else {
                    if (matriz[i][j] > maior){
                        maior = matriz[i][j];
                        lin = i+1;
                        col = j+1;
                    }
                }
            }
        }
        System.out.println("O maior número é o "+maior+" que esta na "+lin+"º linha da "+col+"º coluna.");

    }
    
}
