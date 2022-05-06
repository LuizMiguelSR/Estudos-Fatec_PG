package Aula16_Prova02;

import java.util.Scanner;

/**
 * Escreva um método em Java que receba um vetor de inteiros como parâmetro 
 * e devolva verdadeiro se todos os elementos do vetor forem maiores do que 
 * 0 (zero)
 */
public class P2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = in.nextInt();
        int[] vet = new int [n];
        System.out.print("Digite os valores do vetor: ");
	for (int i = 0; i < n; i++) {
            vet[i] = in.nextInt();
	}
        System.out.println();
        if(Calcular(vet) == true){
            System.out.println("Verdadeiro = Todos os elementos do vetor são maiores que 0");
        } else {
            System.out.println("Falso = Algum dos elementos do vetor são menores ou iguais a 0");
        }        
        in.close();
    }
    
    public static boolean Calcular(int[] vet) {	
	
        for (int i = 0; i < vet.length; i++) {
            if(vet[i] <= 0){
                return false;
            }
	}
        return true;        
    }   
}
