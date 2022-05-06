/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07_Vetor_Matriz;

import java.util.Scanner;

/**
 *Criar um programa que receba a temperatura média de cada mês do ano,
 * em graus centígrados, e armazene essas temperaturas em um vetor.
 * Imprimir as temperaturas de todos os meses, maior e a menor 
 * temperatura do ano e em que mês aconteceram. Suponha que não 
 * há meses com temperaturas iguais.
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int[] mes = new int[5];
        int mai=0, men=0, mesmai=0, mesmen=0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe a média de temperatura do %d º mês: ",i+1);
            mes[i] = in.nextInt();
            if(i == 0){
                mai = mes[i];
                men = mes[i];
            } else {
                if(mes[i] > mai) {
                    mai = mes[i];
                    mesmai = i;
                }
                if(mes[i] < men) {
                    men = mes[i];
                    mesmen = i;
                }
            }
        }
        System.out.println("\nExibindo temperaturas...");
        for (int x = 0; x < 5; x++) {
            System.out.printf("Temperatura do %dº mês: %d\n",x+1,mes[x]);
        }
        System.out.printf("\nA maior temperatura foi de %dº no %dº mês",mai,mesmai+1);
        System.out.printf("\nA menor temperatura foi de %dº no %dº mês\n",men,mesmen+1);
        
    }
    
}
