/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05_Repeticao_While;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class Ex19 {

    /**
     * 19. Desenvolva um programa em Java que dados dois números 
     * inteiros positivos, determinar o máximo divisor comum entre 
     * eles usando o algoritmo de Euclides.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int num1, num2,  resto;
        
        System.out.println("Informe dois números positivos: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        
        do{
            resto = num1%num2;
            num1 = num2;
            num2 = resto;
            
        } while (resto != 0);
        
        System.out.println("MDC = " + num1);
        in.close();
    }
    
}
