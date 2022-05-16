/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Fatec
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private double altura;
    private double peso;
    private Date nascimento;
    private Pessoa mae;
    private Pessoa pai;
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String cpf, String nome, double altura, double peso, Date nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.nascimento = nascimento;
    }
    
    public Pessoa getAvoPaterno(){
        if (pai == null) return null;
        return pai.getPai();
    }
    
    public Pessoa getAvoPaterna(){
        if (pai == null) return null;
        return pai.getMae();
    }
    
    public Pessoa getAvoMaterno(){
        if (mae == null) return null;
        return mae.getPai();
    }
    
    public Pessoa getAvoMaterna(){
        if (mae == null) return null;
        return mae.getMae();
    }
    
    public Integer getIdade(){
        if (nascimento == null) return null;
        Calendar hoje = Calendar.getInstance();
        Calendar nasc = Calendar.getInstance();
        nasc.setTime(nascimento);
        int anoAtual = hoje.get(Calendar.YEAR);
        int anoDeNascimento = nasc.get(Calendar.YEAR);
        return anoAtual = anoDeNascimento;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
}
