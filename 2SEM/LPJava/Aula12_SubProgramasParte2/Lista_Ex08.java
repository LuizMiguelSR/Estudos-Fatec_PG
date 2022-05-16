package Aula12_SubProgramasParte2;

import java.util.Scanner;

/**
 *Escreva um programa em Java que receba um número inteiro n como parâmetro e 
 * devolva uma matriz identidade de ordem n. Obs.: uma matriz identidade de 
 * ordem n é aquele em que todos os elementos da diagonal principal são iguais 
 * a 1 e os demais elementos são iguais a 0
 */
public class Lista_Ex08 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Ordem: ");
        int n = in.nextInt();
        int [][] ret_mat = calcularMatriz(n);
        
        System.out.println("Matriz identidade");
	for (int i = 0; i < ret_mat.length; i++) {
            for (int j = 0; j < ret_mat.length; j++) {
		System.out.printf(ret_mat[i][j]+"\t");
            }
            System.out.println();
        }
        
        in.close();
    }
    public static int[][] calcularMatriz(int n){
        int [][] mat = new int [n][n]; //sempre inicializa com 0
        for(int i = 0; i < n; i++){
            mat[i][i] = 1;
        }
        return mat;
    }
    
}
