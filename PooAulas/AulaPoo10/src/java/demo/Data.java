/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author rlarg
 * 
 * Classe didática utilizada para manipular datas na aula de POO
 */
public class Data {
    /**
     * Atributo para armazenar o dia de uma data
     */
    private int dia;
    private int mês;
    private int ano;
    
    //Construtores
    public Data(){//sem parâmetros
        dia = 1; mês = 1; ano = 2000;
    }
    public Data(int dia, int mês, int ano){//parametrizado
        this.dia = dia; this.mês = mês; this.ano = ano;
    }
    //Método de definição de atributos
    public void setData(int dia, int mês, int ano){
        if(mês>12) mês = 12;
        this.dia = dia; this.mês = mês; this.ano = ano;
    }
    //Métodos de retorno da data formatada
    public String getData(){
        return dia+"/"+mês+"/"+ano;
    }
    public String getAniversário(){
        return dia+"/"+mês;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        if(mês<1) this.mês=1;
        if(mês>12)this.mês=12;
        this.mês = mês;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}