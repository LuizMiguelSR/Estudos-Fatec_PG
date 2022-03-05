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
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite o salário: ");
        float sal = scanner.nextFloat();
        System.out.println("Dgite o valor do empréstimo: ");
        float emp = scanner.nextFloat();
        System.out.println("Digite a quantidade de parcelas: ");
        int par = scanner.nextInt();
        
        float valpar = emp/par;
        float nsal = sal*0.30F;
        
        if (nsal > valpar) {
            System.out.printf("Empréstimo concedido no valor de R$%.2f\n", nsal);
        }else {
            System.out.printf("Empréstimo negado o valor de R$%.2f ultrapassa o percentual mínimo do salário bruto\n", nsal);
        }
        
    }
    
}
