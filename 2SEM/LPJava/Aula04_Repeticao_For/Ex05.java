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
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int res;
        for(int i = 0; i<10; i++){
            System.out.print("Informe um número: ");
            int ent = in.nextInt();
            res = ent*ent;
            System.out.println(res);
        }
    }
    
}
