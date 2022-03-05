package Aula09_Strings;

import java.util.Scanner;

/**
 *Escreva um programa que receba uma string do teclado e informe quantas letras 
 *maiúsculas ela possui.
 */
public class Lista_Ex02 {

    public static void main(String[] args) {
        String str;
        int mai=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a string: ");
        str = in.nextLine();
        for(int i=0; i<str.length(); i++){
            char test = str.charAt(i);            
            if(Character.isUpperCase(test)){
                mai++;
            }
        }
        System.out.println("A string possui "+mai+" letras maiúsculas.");
        in.close();
    }
    
}
