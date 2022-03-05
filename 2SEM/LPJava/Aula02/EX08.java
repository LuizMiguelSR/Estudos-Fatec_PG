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
public class EX08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Integer n1, n2, n3, c=0;
        
        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = scanner.nextInt();
        
        if (n1 < 0 && n2 < 0 && n3 < 0){
            c=3;
        } else if ((n1 < 0 && n2 < 0)||(n2 < 0 && n3 < 0)||(n1 < 0 && n3 < 0)) {
            c=2;
        } else if (n1 < 0 || n2 < 0 || n3 < 0) {
            c=1;
        } else {
            c=0;
        }
        System.out.println("Temos "+c+" números negativos.");
    }
    
}
