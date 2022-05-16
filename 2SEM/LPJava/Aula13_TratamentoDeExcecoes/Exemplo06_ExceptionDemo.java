package Aula13_TratamentoDeExcecoes;

public class Exemplo06_ExceptionDemo {
	static void compute(int a) throws Exemplo06_MyException {
		System.out.println("compute(" + a + ") chamado");
		if (a > 10) {
			throw new Exemplo06_MyException(a);
		}
		System.out.println("Saída normal");
	}

	public static void main(String args[]) {
		try {
			compute(1);
			compute(20);
		} catch (Exemplo06_MyException e) {
			System.out.println("Pego " + e);
		}
	}

}
