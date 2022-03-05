package Aula13_TratamentoDeExcecoes;

public class Exemplo06_FinallyDemo {
	// Lança uma exceção para for a do método
	static void procA() {
		try {
			System.out.println("dentro de procA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("finally de procA");
		}
	}

	// Retorna de dentro de um bloco try
	static void procB() {
		try {
			System.out.println("dentro de procB");
			return;
		} finally {
			System.out.println("finally de procB");
		}
	}

	// Executa um bloco try normalmente
	static void procC() {
		try {
			System.out.println("dentro de procC");
		} finally {
			System.out.println("finally de procC");
		}
	}

	public static void main(String args[]) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("Exceção pega");
		}
		procB();
		procC();
	}

}