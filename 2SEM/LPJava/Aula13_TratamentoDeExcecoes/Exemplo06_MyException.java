package Aula13_TratamentoDeExcecoes;

public class Exemplo06_MyException extends Exception {
	private int detail;

	Exemplo06_MyException(int a) {
		detail = a;
	}

	public String toString() {
		return "MyException[" + detail + "]";
	}
}
