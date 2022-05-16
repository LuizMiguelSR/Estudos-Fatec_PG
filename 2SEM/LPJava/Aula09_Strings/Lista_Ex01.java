/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09_Strings;

/**
 *
 * @author Luiz Miguel
 */
public class Lista_Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String str1 = "arte de tudo ";
        String str2 = "Eu li p";
        String str3 = "ao longo da viagem";
        str1 = str1.concat(str3);
        str2 = str2.concat(str1);
        System.out.println(str2);
    }
    
}
