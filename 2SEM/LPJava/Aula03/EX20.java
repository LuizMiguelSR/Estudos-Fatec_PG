/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class EX20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String diaDaSemana;
        System.out.print("Digite o dia da semana: ");
        int dia = scanner.nextInt();
        
        switch (dia){
        case 1: diaDaSemana = "Domingo";
                break;
        case 2: diaDaSemana = "Segunda";
                break;
        case 3: diaDaSemana = "Terça";
                break;
        case 4: diaDaSemana = "Quarta";
                break;
        case 5: diaDaSemana = "Quinta";
                break;
        case 6: diaDaSemana = "Sexta";
                break;
        case 7: diaDaSemana = "Sábado";
                break;
        default: diaDaSemana = "Data inválida";
        }
        System.out.println("O dia da semana digitado foi "+diaDaSemana+"-feira");
    }
    
}
