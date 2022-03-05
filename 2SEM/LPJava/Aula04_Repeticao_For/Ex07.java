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
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Dgite o limite: ");
        int ent = in.nextInt();
            for(int i = 1; i < ent; i++){
                if(i%2==0){
                    System.out.print(i+" - ");
                }
            }
    }
    
}
