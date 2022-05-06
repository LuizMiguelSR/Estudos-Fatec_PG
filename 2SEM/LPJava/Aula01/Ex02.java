/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float med = (n1+n2)/2;
        
        System.out.printf("A média é: %.2f\n", med);
        
    }
    
}
