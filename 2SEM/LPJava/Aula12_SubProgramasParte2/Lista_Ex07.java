package Aula12_SubProgramasParte2;

import java.util.Random;
import java.util.Scanner;

/**
 *Escreva um programa em Java contendo um método que receba como parâmetro um 
 * vetor com  n valores inteiros quaisquer. Determine e retorne outro vetor 
 * com dois elementos, sendo que na primeira posição há o menor número inteiro 
 * e na segunda posição, o maior número inteiro.
 */
public class Lista_Ex07 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Digite o tamanho do vetor: ");
        int n = in.nextInt();
        int[] vet = new int [n];
	for (int i = 0; i < n; i++) {
            vet[i] = rand.nextInt(n*2);
            System.out.print(vet[i]+" ");
	}
        System.out.println();
        int [] ret_vet = criarVetor(vet, n);
        for(int i = 0; i < ret_vet.length; i++){
            if(i == 0){
                System.out.println("Menor número: "+ret_vet[i]);
            } else {
                System.out.println("Maior número: "+ret_vet[i]);
            }
            
        }
        in.close();
    }
    
    public static int[] criarVetor(int[] vet, int n) {	
        int mai=0, men=0;
        mai = vet[0];
        men = vet[0];
	for (int i = 1; i < n; i++) {
            if(vet[i] > mai){
                mai = vet[i];
            }else{
                if(vet[i] < men){
                    men = vet[i];
                }
            }
	}
        int []ret_vet = {men, mai};
        return ret_vet;
    }   
}
