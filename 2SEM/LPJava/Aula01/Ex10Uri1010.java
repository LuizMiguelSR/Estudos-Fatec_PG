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
public class Ex10Uri1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        double C = entrada.nextDouble();
        int D = entrada.nextInt();
        int E = entrada.nextInt();
        double F = entrada.nextDouble();
        double resultado = (B*C)+(E*F);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",resultado);
        
    }
    
}
