/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author Fatec
 * 
 * Classe didatica utilizada para aula de POO
 */
public class Data {
    /**
     * Atributo para armazenar o dia de uma data
     */
    public int dia;
    public int mes;
    public int ano;
    
    // Construtor
    public Data(){
        dia = 1; mes = 1; ano = 2000;
    }
    
    // Método de definição de atributos
    public void setData(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }
    
    // Método de retorno da data formatada
    public String getData(){
        return dia + "/" + mes + "/" + ano;
    }
    
    
}
