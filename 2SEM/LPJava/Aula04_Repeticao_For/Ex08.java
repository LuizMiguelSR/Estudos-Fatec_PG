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
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int result = 1;
        
        System.out.println("Entre com os valores de n e k: ");
        int n = in.nextInt();
        int k = in.nextInt();
        
        for (int i = 1; i < k; i++){
            result *= n;
        }
        System.out.println(result);
    }
    
}
