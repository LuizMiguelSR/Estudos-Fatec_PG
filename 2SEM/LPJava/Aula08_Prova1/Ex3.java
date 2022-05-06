/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08_Prova1;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int inicio = entrada.nextInt();
        int fim = entrada.nextInt();
        int duracao = 24 - (24 + inicio - fim) % 24;
        if (inicio == fim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }
    }
    
}
