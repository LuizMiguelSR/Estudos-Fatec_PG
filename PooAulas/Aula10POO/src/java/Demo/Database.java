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
public class Database {
    public static ArrayList<Contato> getContatos(){
        ArrayList<Contato> list = new ArrayList<>();
        list.add(new Contato("João", "(13)99111-0001", new Data(1,1,2000)));
        list.add(new Contato("José", "(13)99111-0002", new Data(1,2,2000)));
        list.add(new Contato("Maria", "(13)99111-0003", new Data(1,3,2000)));
        return list;
    }
}
