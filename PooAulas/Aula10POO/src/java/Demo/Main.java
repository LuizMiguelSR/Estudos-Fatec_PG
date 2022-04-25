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
        
        // Exemplo de declaração e instanciação de um objeto
        Data hoje; // Declaração do objeto
        hoje = new Data(); // Instanciação do objeto
        
        hoje.dia = 25;
        hoje.mes = 4;
        hoje.ano = 2022;
        
        Data amanha;
        amanha = new Data();
        amanha.dia = 26;
        amanha.mes = 4;
        amanha.ano = 2022;
        System.out.println("Hoje é dia " + hoje.dia);
    }
}
