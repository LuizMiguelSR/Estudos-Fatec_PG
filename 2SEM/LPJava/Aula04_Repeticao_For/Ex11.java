/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04_Repeticao_For;

import java.util.Random;

/**
 *
 * @author Luiz Miguel
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio = new Random();
        int maior_dia = 0;
        int vendas, maior_venda = 0;

        for (int i = 1; i <= 31; i++) {
            vendas = aleatorio.nextInt(200);
            System.out.printf("O dia: %02d/03/2021\n", i);
            System.out.printf("A quantodade de discos vendidos foi: %d\n", vendas);

            if (maior_venda < vendas) {
                maior_venda = vendas;
                maior_dia = i;
            }
        }
        System.out.printf("O dia com a maior venda foi: %02d/03/2021\n", maior_dia);
        System.out.printf("A quantodade de discos vendidos foi: %d\n", maior_venda);
    }  
}
