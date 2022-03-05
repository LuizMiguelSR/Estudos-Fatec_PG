/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class EX23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String nome, m;
        System.out.print("Informe seu nome: ");
        nome = in.nextLine();
        System.out.print("Informe seu sexo (M/F): ");
        char sexo = in.nextLine().charAt(0);
        System.out.println ("Muito obrigado, " + (sexo == 'M' || sexo == 'm' ? "Sr." : "Sra.") + nome);

    }
    
}
