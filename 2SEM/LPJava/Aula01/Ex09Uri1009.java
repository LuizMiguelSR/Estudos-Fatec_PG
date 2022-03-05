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
public class Ex09Uri1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =  new Scanner(System.in);
        String nome = scanner.nextLine();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        
        double total = (vendas*0.15)+salario;
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
    
}
