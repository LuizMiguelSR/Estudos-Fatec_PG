/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author rlarg
 */
public class Contato {
    private String nome;
    private String telefone;
    private Data nascimento;
    
    public static ArrayList<Contato> getList(){
        ArrayList<Contato> list = new ArrayList<>();
        list.add(new Contato("Fulano", "(13)99111-0001", new Data(1,1,2000)));
        list.add(new Contato("Beltrano", "(13)99111-0002", new Data(2,1,2000)));
        list.add(new Contato("Cicrano", "(13)99111-0003", new Data(3,1,2000)));
        return list;
    }

    public Contato(String nome, String telefone, Data nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}