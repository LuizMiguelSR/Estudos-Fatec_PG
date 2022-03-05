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
public class Ex03C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int raio = scanner.nextInt();
        double pi = Math.PI;
        double cir = 2 * pi * raio;
        
        System.out.printf("Circunferência: %.2f\n", cir);
    }
}
