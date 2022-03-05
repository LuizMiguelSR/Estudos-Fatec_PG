package Aula09_Strings;

import java.util.Scanner;

/**
 *Escreva um programa que dadas duas strings, exiba-as em ordem alfabética.
 */
public class Exercicio02_Ordem_Alfabetica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String str1, str2;
        System.out.print("Conteúdo da string 1 ");
        str1 = in.nextLine();
        System.out.print("Conteúdo da string 2 ");
        str2 = in.nextLine();
        
        if(str1.compareToIgnoreCase(str2) < 0){
            System.out.print(str1+" "+str2);
        } else {
            System.out.print(str2+" "+str1);
        }
        System.out.println();
        in.close();
    }
    
}
