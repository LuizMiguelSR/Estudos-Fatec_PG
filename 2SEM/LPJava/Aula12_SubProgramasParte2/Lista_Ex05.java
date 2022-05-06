package Aula12_SubProgramasParte2;
/*
 * Escreva  um programa em Java que use  um  método  que recebe  como parâmetro 
 * uma matriz   quadrada   de   ordem  n  de   inteiros   e   devolve   verdadeiro   
 * se   ela   é   uma   matriz triangular superior, ou falso, caso contrário. 
 * Obs.: uma matriz triangular superior é uma matriz onde todos os elementos 
 * de posições acima da diagonal principal são diferentes de0 e os demais 
 * elementos são iguais a 0
 */
import java.util.Scanner;

public class Lista_Ex05 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Tamanho da matriz: ");
        int matSize = sc.nextInt();
        
        int[][] matrix = new int[matSize][matSize];
        
        System.out.printf("Insira a matriz[%d][%d]:\n", matSize, matSize);
        
        for (int i = 0; i < matSize; i++) {
            for (int j = 0; j < matSize; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }        
        if (isTriangular(matrix)) {
            System.out.println("É uma matriz triangular superior.");
        } else {
            System.out.println("Não é uma matriz triangular superior.");
        }
        sc.close();
    }
    
    public static boolean isTriangular(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; i++) {            
            for (int j = 1 + i; j < matrix.length; j++) {
                if (matrix[i][j] == 0) return false; // Acima da diagonal
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x <= i; x++) {
                if (matrix[i][x] != 0) return false; // Diagonal e abaixo
            }
        }

        return true;
    }

 

}