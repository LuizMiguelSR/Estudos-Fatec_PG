package Aula12_SubProgramasParte2;

import java.util.Random;
import java.util.Scanner;

/**
 *Escreva  um programa em Java que use  um  método  que recebe como parâmetro  
 * uma matriz A bidimensional de valores reais e um valor real x, e multiplica 
 * todos os elementos de A por x. No final, o programa deve exibir a matriz.
 */
public class Lista_Ex06 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Digite as dimensões da matriz: ");
	int l = in.nextInt(), c = in.nextInt();
	float[][] a = new float[l][c];
	System.out.print("Digite o multiplicador: ");
	int x = in.nextInt();
	Random rand = new Random();
        
        System.out.println("Conteudo da matriz:");
	for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
		a[i][j] = rand.nextFloat();
                System.out.printf("%.4f\t", a[i][j]);
            }
            System.out.println();
	}
        calcularMatriz(a, x);
        imprimirMatriz(a);
	in.close();
    }
    public static void calcularMatriz(float[][] a, int x) {
	for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] * x;
            }
	}
    }
    public static void imprimirMatriz(float[][] mat){
	System.out.println("Conteudo da matriz multiplicada:");
	for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
		System.out.printf("%.4f\t", mat[i][j]);
            }
            System.out.println();
        }
    }
}
