package Aula09_Strings;

import java.util.Scanner;

/**
 *Escreva um programa que dada uma string,  escreva-a de trás para frente
 */
public class Exercicio01_Ordem_Inversa {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String palavra;
        
        System.out.print("Conteúdo da string: ");
        palavra = in.nextLine();
        
        for(int i = palavra.length()-1; i >= 0; i--){
            System.out.print(palavra.charAt(i)+" ");
        }
        in.close();
    }
    
}
