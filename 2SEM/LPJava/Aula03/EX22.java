/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class EX22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int d, m, a, n, z;
        System.out.print("Digite o dia: ");
        d = in.nextInt();
        System.out.print("Digite o mes: ");
        m = in.nextInt();
        System.out.print("Digite o ano: ");
        a = in.nextInt();
        n = (d*1000000)+(m*10000)+a;
        System.out.println(n);
        z = n%9;
        System.out.println(z);
        switch (z){
            case 0: System.out.println("irresistível");
                break;
            case 1: System.out.println("impetuoso");
                break;
            case 2: System.out.println("discreto");
                break;
            case 3: System.out.println("amoroso");
                break;
            case 4: System.out.println("tímido");
                break;
            case 5: System.out.println("paquerador");
                break;
            case 6: System.out.println("estudioso");
                break;
            case 7: System.out.println("sonhaodor");
                break;
            case 8: System.out.println("charmoso");
                break;
        }
        
    }
    
}
