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
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor gasto: ");
        float vg = entrada.nextFloat();
        float gj = vg * 0.10f;
        System.out.printf("Valor da gorjeta é R$ %.2f\n", gj);
    }
    
}
