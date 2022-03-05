package Aula09_Strings;

public class OcorrenciaString {

	public static void main(String[] args) {
		String str = "Fatec Praia Grande";
		System.out.println(str.indexOf("ra"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("ra", 10));
		System.out.println(str.indexOf('a', 10));
		System.out.println(str.lastIndexOf("ra"));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.startsWith("Fatec"));
		System.out.println(str.endsWith("Grande"));
		System.out.println(str.startsWith("Fatec", 5));
	}

}
