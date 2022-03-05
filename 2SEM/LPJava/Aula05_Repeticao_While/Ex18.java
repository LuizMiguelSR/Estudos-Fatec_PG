/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05_Repeticao_While;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
		
	double x, p;
		
	System.out.print("Informe o valor cuja raiz quadrada voce quer determinar: ");
	x = in.nextDouble();
	// p = x / 2;
	p = new Random().nextInt(100);
	while (Math.abs(p * p - x) >= 0.0001) {
            p = (p + x /p) / 2;
	}
		
	System.out.printf("Raiz quadrada de %.2f = %.2f\n", x, p);
	in.close();
    }
    
}
