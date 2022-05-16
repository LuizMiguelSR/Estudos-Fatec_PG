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
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        double massa;
        int tempo = 0, horas, minutos, segundos;
        
        System.out.println("Informe a massa do material radioativo: ");
        massa = in.nextDouble();
        while (massa >= 0.5){
            massa/= 2;
            tempo += 50;
        }
        
        horas = tempo / 3600;
        minutos = (tempo % 3600) / 60;
        segundos = (tempo % 3600) % 60;
        System.out.printf("Massa do material após %d hora(s), %d minuto(s) e %d segundo(s): %.2f\n", horas, minutos, segundos, massa);
        in.close();
    }
    
}
