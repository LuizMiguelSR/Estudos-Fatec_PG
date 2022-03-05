package Aula13_TratamentoDeExcecoes;

public class Exemplo05_ThrowDemo {
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("Pega dentro de demoproc.");
			throw e; // relança a exceção
		}
	}

	public static void main(String args[]) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Pega novamente: " + e);
		}
	}

}
