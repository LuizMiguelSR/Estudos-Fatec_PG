/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08_Prova1;

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
        Scanner in =  new Scanner(System.in);
        System.out.println("Informe o numero da marca do automovel: ");
        int marca = in.nextInt();
        switch (marca){
            case 1: System.out.println("Chevrolet");
                break;
            case 2: System.out.println("Volkswagen");
                break;
            case 3: System.out.println("Fiat");
                break;
            case 4: System.out.println("Honda");
                break;
            default: System.out.println("Marca desconhecida");
        }
        in.close();
    }
    
}
