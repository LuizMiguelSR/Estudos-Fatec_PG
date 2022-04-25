/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author Fatec
 */
public class Main {
    public static void main(String[] args) {
        //Exemplo de declaração, instanciação e definição de um objeto
        Data hoje = new Data();
        hoje.setAno(2022);
        hoje.setMês(4);
        hoje.setDia(25);
        System.out.println("Hoje é dia "+hoje.getDia());
        
        Data amanhã;
        amanhã = new Data();
        amanhã.setDia(26);
        amanhã.setMês(4);
        amanhã.setAno(2022);
    }
}
