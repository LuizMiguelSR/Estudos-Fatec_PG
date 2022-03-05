package Aula11_SubProgramas;

import java.util.Scanner;

/**
 *Escreva um programa em Java contendo um método que recebe dois números 
 * positivos como parâmetros e retorne a soma dos números inteiros existentes 
 * entre eles.
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite 2 números: ");
        int n1 = in.nextInt(), n2 = in.nextInt();
        int soma = calcularSoma(n1, n2);
        System.out.println("Somatório: "+soma);
        in.close();
    }
    private static int calcularSoma (int n1, int n2){
        int soma = 0;
        if (n1 > n2){
            for(int i = n2; i <= n1; i++){
                soma = soma + i;
            }
        } else if (n2 > n1) {
            for(int i = n1; i <= n2; i++){
                soma = soma + i;
            }
        } else {
            soma = n1+n2;
        }
        return soma;
    }
}
