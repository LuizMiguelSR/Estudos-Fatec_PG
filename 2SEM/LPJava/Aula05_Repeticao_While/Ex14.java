/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05_Repeticao_While;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int ent, c=0;
        
        System.out.print("Informe um número natural: ");
        ent = in.nextInt();
        
        while (c * (c+1) * (c+2) < ent){
            c++;
        }
        if (c * (c+1) * (c+2) == ent){
            System.out.println(ent+ " é triangular");
        } else {
            System.out.println(ent+ " não é triangular");
        }
    }
}
