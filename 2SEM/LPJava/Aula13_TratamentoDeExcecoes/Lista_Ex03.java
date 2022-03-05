package Aula13_TratamentoDeExcecoes;

public class Lista_Ex03 {

    public static void main(String[] args) {
		int a, d = 0;		 
		try{			
			a = 42 / d;			
		} catch (ArithmeticException i) {			
			System.out.println("Excecao");	
		} catch (Exception e) {			
			System.out.println("Divisão por zero");
		}
    }
    
}
