package Aula13_TratamentoDeExcecoes;

public class ThrowsDemo {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Dentro de throwOne.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Pego " + e);
		}
	}

}
