/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author rlarg
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