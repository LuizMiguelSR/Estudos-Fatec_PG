/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class EX07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Dgite o segundo número: ");
        int n2 = scanner.nextInt();
        
        if (n1>n2) {
            System.out.println("Ordem decrescente: "+n1+" - "+n2);
        } else if (n2>n1) {
            System.out.println("Ordem decrescente: "+n2+" - "+n1);
        } else {
            System.out.println("Ambos os números são iguais.");
        }
    }
    
}
