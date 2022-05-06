package Aula12_SubProgramasParte2;

import java.util.Scanner;

/**
 *Escreva um programa em Java que use um método que receba um vetor de inteiros
 * de n elementos e troque o 1º elemento pelo último, o 2º pelo
 * penúltimo, o 3º pelo antepenúltimo, e assim sucessivamente. O programa 
 * deve solicitar o tamanho do vetor e seus elementos, utilizar a função para 
 * inverter a ordem dos elementos do vetor e depois mostre o vetor.
 */
public class Lista_Ex01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Informe o tamanho: ");
        int n = in.nextInt();
        int [] vet = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Digite o "+(i+1)+"º elemento: ");
            vet[i] = in.nextInt();
        }
        
        System.out.println("Vetor normal");
        for(int i = 0; i < n; i++){
            System.out.print(vet[i]+" ");
        }
        System.out.println("\nVetor inverso");
        trocarVetor(vet);
        System.out.println();
        in.close();
    }
    
    public static void trocarVetor(int[] vet){
        int [] vetb = new int[vet.length];
        int j = 0;
        for(int i = vet.length-1; i >= 0; i--){
            vetb[j] = vet[i];
            j++;
        }
        for(int i = 0; i < vetb.length; i++){
            vet[i] = vetb[i];
            System.out.print(vet[i]+" ");
        }
    }
    
}
