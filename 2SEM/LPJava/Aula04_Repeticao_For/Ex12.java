/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04_Repeticao_For;

/**
 *
 * @author Luiz Miguel
 */
public class Ex12 {
    public static void main(String args[]) {
        int fat = 1;
        int num = 0;

        System.out.printf("Fatorial de %d é igual a %d\n", num, fat);

        for(num = 1; num <= 10; num++){
            fat *= num;
            System.out.printf("Fatorial de %d é igual a %d\n", num, fat);
        }
    }
}
