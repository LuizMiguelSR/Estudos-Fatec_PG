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
public class Ex03A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int raio = scanner.nextInt();
        int diam = 2 * raio;
        
        System.out.println("Diamentro: "+diam);
    }
    
}
