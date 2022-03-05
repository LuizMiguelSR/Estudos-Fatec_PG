package Aula09_Strings;

import java.util.Scanner;

public class Lista_Ex07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char ch;
		in.nextLine();
		for (int i = 1; i <= n; i++) {
			StringBuffer str = new StringBuffer(in.nextLine());
			// 1a. passada: soma 3 ao código ASCII das letras maiúsculas e minúsculas
			for (int j = 0; j < str.length(); j++) {
				ch = str.charAt(j);
				// if (Character.isLetter(ch)) 
				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
					ch = (char) (ch + 3);
					str.setCharAt(j, ch);
				}
			}
			// 2a. passada: inverte a string
			str.reverse();
			// 3a. passada: subtrai 1 do código ASCII dos caracteres da metade da string em diante
			for (int j = str.length() / 2; j < str.length(); j++) {
				ch = str.charAt(j);
				ch = (char) (ch - 1);
				str.setCharAt(j, ch);
			}
			System.out.println(str);
		}
		in.close();
	}

}
