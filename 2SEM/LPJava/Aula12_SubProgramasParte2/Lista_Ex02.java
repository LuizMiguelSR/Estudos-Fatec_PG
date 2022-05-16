package Aula12_SubProgramasParte2;

import java.util.Scanner;

/**
 *Um programa em Java contendo um método que receba dois valores, sendo um dos 
 * valores o preço antigo de um produto e o outro o preço atual. O método 
 * deverá calcular e retornar o percentual de acréscimo entre esses preços.
 */
public class Lista_Ex02 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Preço antigo: R$ ");
        float pa = in.nextInt();
        System.out.print("Preço novo: R$ ");
        float pn = in.nextInt();
        float res_calcularPercentual = calcularPercentual(pa, pn);
        System.out.println("Percentual "+res_calcularPercentual+"%");
        in.close();
    }
    public static float calcularPercentual(float pa, float pn){
        return ((float)pn/(float)pa)*100;
    } 
}
