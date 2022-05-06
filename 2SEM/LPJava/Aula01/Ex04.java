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
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        System.out.println("Digite o raio do cone:");
        int r = scanner.nextInt();
        System.out.println("Digite a altura do cone:");
        int h = scanner.nextInt();
        float v = (float) ((pi*Math.pow(r, 2)*h)/3);
        System.out.printf("O volume do cone e: %.0f cm³\n", v);
        
    }
    
}
