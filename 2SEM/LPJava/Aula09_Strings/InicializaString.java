package Aula09_Strings;

public class InicializaString {

	public static void main(String[] args) {
		String str1 = new String("Fatec");
		String str2 = "Praia Grande";
	    char[] caracteres = { 'A', 'D', 'S' };
	    String str3 = new String(caracteres);
		byte[] codigos = { 65, 68, 83 };
		String str4 = new String(codigos);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
