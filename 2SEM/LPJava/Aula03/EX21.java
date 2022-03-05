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
public class EX21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int data, dia, mes, ano;
        
        System.out.println("Informe uma data no formato ddmmaaaa: ");
        data = in.nextInt();
        in.close();
        
        dia = data/1000000;
        mes = data/10000;
        mes = mes%100;
        ano = data%10000;
        
        switch(mes){
            case 1: System.out.println("Data: "+dia+"/Janeiro/"+ano);
                break;
            case 2: System.out.println("Data: "+dia+"/Fevereiro/"+ano);
                break;
            case 3: System.out.println("Data: "+dia+"/Março/"+ano);
                break;
            case 4: System.out.println("Data: "+dia+"/Abril/"+ano);
                break;
            case 5: System.out.println("Data: "+dia+"/Maio/"+ano);
                break;
            case 6: System.out.println("Data: "+dia+"/Junho/"+ano);
                break;
            case 7: System.out.println("Data: "+dia+"/Julho/"+ano);
                break;
            case 8: System.out.println("Data: "+dia+"/Agosto/"+ano);
                break;
            case 9: System.out.println("Data: "+dia+"/Setembro/"+ano);
                break;
            case 10: System.out.println("Data: "+dia+"/Outubro/"+ano);
                break;
            case 11: System.out.println("Data: "+dia+"/Novembro/"+ano);
                break;
            case 12: System.out.println("Data: "+dia+"/Dezembro/"+ano);
                break;
            default: System.out.println("Data inválida");            
        }
    }
    
}
