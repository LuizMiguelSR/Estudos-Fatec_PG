package Aula10_StringBuffer;

public class DeleteStringBuffer {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Fatec Praia Grande");
		str.delete(7, 11);
		str.delete(9, str.length());
		str.deleteCharAt(7);
		System.out.println(str);
	}

}
