/*
 * Escreva uma programa em Java que receba como dados de entrada 
dois números inteiros, n e m, o número de linhas e colunas de
uma matriz, respectivamente. Depois o programa deve gerar a 
matriz de inteiros com valores aleatórios (use a classe Random) 
no intervalo entre 0 e n * m * 10. Na sequência o programa deve 
imprimir o conteúdo da matriz gerada, a média dos elementos da 
matriz e quantos elementos da matriz são maiores do que essa média.
 */
package Aula08_Prova1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int maior = 0, menor = 0, soma=0, ne; 
        float media;
        System.out.print("Informe o numero de linhas: ");
	int n = in.nextInt();
        System.out.print("Informe o numero de colunas: ");
	int m = in.nextInt();
	int [][] mat = new int[n][m];
        ne = n*m;
        for ( int i = 0; i < n; i++ ) {
            for (int j = 0; j < m; j++) {
                mat[i][j]=rand.nextInt(n*m*10);
                soma += mat[i][j];
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        
        media = soma/ne;
        
        System.out.println("A média dos elementos da matriz é "+media);
        
        for ( int i = 0; i < mat.length; i++ ) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > media){
                    maior++;
                }
            }
        }        
        
        System.out.println("A quantidade de elementos maiores que a média é de "+maior);
        
    }
    
}
