/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04_Repeticao_For;

/**
 * 13. Desenvolva um programa em Java que dado n e dois números naturais i e j diferentes de 0,
 * imprimir em ordem crescente os n primeiros naturais que são múltiplos de i ou de j. Exemplo:
 * Para n = 6 , i = 2 e j = 3 a saída deverá ser: 0, 2, 3, 4, 6, 8.
 */
public class Ex13 {

    public static void main(String[] args) {
	int fat = 1;
	int num = 0;
	System.out.printf("Fatorial de %d é igual a %d\n", num, fat);

	for (num = 1; num <= 10; num++) {
		fat *= num;

		System.out.printf("Fatorial de %d é igual a %d\n", num, fat);
	}

    }
    
}
