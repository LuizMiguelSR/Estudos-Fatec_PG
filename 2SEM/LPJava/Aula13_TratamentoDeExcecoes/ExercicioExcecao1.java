/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula13_TratamentoDeExcecoes;

/**
 *
 * @author Luiz Miguel
 */
public class ExercicioExcecao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("Isto não será exibido");
	} catch (NumberFormatException|ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro de argumento e formato inválido");
        }
	System.out.println("Após o catch");       
    }
    
}
