/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;
import java.util.Scanner;

public class Exercício01Slide {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Digite a nota 1:");
        int n1 = scanner.nextInt();
        
        System.out.println("Digite a nota 2: ");
        int n2 = scanner.nextInt();
        
        float media = (n1+n2)/2;
        
        if (media >= 6) {
            System.out.printf("Com média de  %.2f o aluno esta aprovado\n", media); 
        } else {
            System.out.printf("Com média de  %.2f o aluno esta reprovado\n", media);
        }
    }
    
}
