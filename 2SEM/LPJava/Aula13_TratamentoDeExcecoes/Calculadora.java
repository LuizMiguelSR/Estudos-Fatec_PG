package Aula13_TratamentoDeExcecoes;

public class Calculadora {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[2]);
		char op = args[1].charAt(0);
		switch (op) {
		case '+': 
			System.out.println(a + b);
			break;
		case '-': 
			System.out.println(a - b);
			break;
		case '.': 
			System.out.println(a * b);
			break;
		case '/': 
			System.out.println(a / b);
			break;
		default:
			System.out.println("Operador invalido");
		}
	}

}
