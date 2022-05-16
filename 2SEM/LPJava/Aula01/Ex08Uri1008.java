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
public class Ex08Uri1008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double value = scanner.nextDouble();
        
        double salary = hours * value;
        
        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
    
}
