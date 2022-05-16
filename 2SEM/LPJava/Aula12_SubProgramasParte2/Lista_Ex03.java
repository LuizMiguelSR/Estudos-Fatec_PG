package Aula12_SubProgramasParte2;

import java.util.Scanner;

/*
* Um programa em Java contendo um método que receba como parâmetros as três 
* notas de um aluno e uma letra. Se a letra for ‘A’, o método deverá calcular 
* a média aritmética das notas do aluno; se for ‘P’, deverá calcular a 
* média ponderada, com os pesos 5, 3 e 2. A média calculada deverá ser 
* devolvida ao programa principal para, então, ser mostrada.
*/
public class Lista_Ex03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a 1º nota: ");
        float n1 = in.nextFloat();
        System.out.print("Digite a 2º nota: ");
        float n2 = in.nextFloat();            
        System.out.print("Digite a 3º nota: ");
        float n3 = in.nextFloat();
        System.out.print("Operação: ");
        char l = in.next().charAt(0);        
        float ret_Media = calcularMedia(n1, n2, n3, l);               
        System.out.println("Media Final: "+ret_Media);        
        in.close();
    }
    public static float calcularMedia(float n1, float n2, float n3, char fUpper){
        fUpper = Character.toUpperCase(fUpper);
        if(fUpper == 'A'){
            return (n1 + n2 + n3)/3;
        } else if(fUpper == 'P'){
            return ((n1*5)+(n2*3)+(n3*2))/10;
        } else {
            return 0;
        }
        
    }
}
