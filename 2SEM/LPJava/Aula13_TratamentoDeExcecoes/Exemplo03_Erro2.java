package Aula13_TratamentoDeExcecoes;

public class Exemplo03_Erro2 {

	public static void main(String[] args) {
		int a, d = 0;
		try {
			a = 42 / d;
			System.out.println("Isto não será exibido");
		} catch (ArithmeticException e) {
			System.out.println("Divisão por zero");
		}
		System.out.println("Após o catch");
	}

}
