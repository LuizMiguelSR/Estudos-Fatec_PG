package Aula10_StringBuffer;

public class ReplaceStringBuffer {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("fatec PG");
		str.replace(6, 8, "Praia Grande");
		str.setCharAt(0, 'F');
		System.out.println(str);
	}

}
