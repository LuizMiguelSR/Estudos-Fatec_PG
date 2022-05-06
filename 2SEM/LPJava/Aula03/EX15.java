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
public class EX15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
	float altura, pesoIdeal;
	System.out.print("Informe sua altura em metros: ");
	altura = in.nextFloat();
	in.nextLine();
	System.out.print("Informe seu sexo (M/F): ");		
	char sexo = in.nextLine().charAt(0);

	pesoIdeal = (sexo == 'M' || sexo == 'm' ? (72.7f*altura)-58 : (62.1f*altura)-44.7f);
        in.close();
        System.out.printf("Seu peso ideal é %.1f Kg\n", pesoIdeal);
    }
    
}
