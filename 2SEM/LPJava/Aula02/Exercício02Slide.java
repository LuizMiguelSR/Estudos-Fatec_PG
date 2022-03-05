/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

import java.util.Scanner;

public class Exercício02Slide {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        float credito, saldo;
        
        System.out.println("Digite o saldo:");
        saldo = scanner.nextInt();
        
        if (saldo > 5000) {
            credito = saldo * 2; 
        } else if (saldo > 3000 ) {
            credito = saldo * 1.5F;
        } else if (saldo > 1000){
            credito = saldo * 1;
        } else {
            credito = saldo * 0.75F;
        }
        System.out.printf("O credito é: R$ %.2f\n", credito);
    }
}
