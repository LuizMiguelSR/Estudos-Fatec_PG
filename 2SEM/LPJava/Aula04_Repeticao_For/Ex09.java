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
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int qtdev, mai=0, dia=0;
        for (int i = 1; i <= 3; i++){
            System.out.print("Dgite quantas vendas foram realizadas no "+i+"º dia: ");
            qtdev = in.nextInt();
            if (i==1){
                mai = qtdev;
                dia = i;
            } else {
                if(qtdev>mai){
                    mai = qtdev;
                    dia = i;
                }
            }
        }
        System.out.println("O dia que mais vendeu foi o "+dia+"º dia com "+mai+" vendas.");
    }
    
}
