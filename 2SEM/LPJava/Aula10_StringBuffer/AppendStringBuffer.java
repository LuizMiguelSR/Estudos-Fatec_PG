package Aula10_StringBuffer;

public class AppendStringBuffer {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Fatec");
		str.append(" Praia Grande ");
		str.append(2021);
		char array[] = "Aula de Strings ".toCharArray();		
		str.append(array, 7, 9);
		str.append(array, 6, 8);
		str.append("Buffer");
		System.out.println(str);		
	}

}
