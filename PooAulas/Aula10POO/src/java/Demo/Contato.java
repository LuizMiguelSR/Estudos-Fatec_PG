/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.ArrayList;

/**
 *
 * @author Fatec
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
