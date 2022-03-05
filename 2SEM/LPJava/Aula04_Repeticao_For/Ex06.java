/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04_Repeticao_For;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class Ex06 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
	System.out.println("Digite um conjunto de numeros inteiros (0 p/ terminar): ");
	int n = in.nextInt();
	while (n != 0) {
		System.out.println(n + " ao quadrado = " + (n * n));
		n = in.nextInt();
	}
	in.close();
    }
}
