package Aula09_Strings;

import java.util.Scanner;

public class Lista_Ex08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		char ch;
		in.nextLine();
		int num1Inicio = 0, num1Final = 0, num2Inicio = 0, num2Final = 0, num3Inicio = 0, num3Final = 0, soma;
		String str = in.nextLine();
		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			//if (Character.isDigit(ch))
			if (ch >= '0' && ch <= '9') {
				num1Inicio = i;
				for (i = i + 1; i < str.length(); i++) {
					ch = str.charAt(i);
					//if (Character.isLetter(ch)) 
					if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
						num1Final = i;
						break;
					}
				}
				break;
			}
		}
		for (i = i + 1; i < str.length(); i++) {
			ch = str.charAt(i);
			//if (Character.isDigit(ch))
			if (ch >= '0' && ch <= '9') {
				num2Inicio = i;
				for (i = i + 1; i < str.length(); i++) {
					ch = str.charAt(i);
					//if (Character.isLetter(ch)) 
					if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
						num2Final = i;
						break;
					}
				}
				break;
			}			
		}
		for (i = i + 1; i < str.length(); i++) {
			ch = str.charAt(i);
			//if (Character.isDigit(ch))
			if (ch >= '0' && ch <= '9') {
				num3Inicio = i;
				for (i = i + 1; i < str.length(); i++) {
					ch = str.charAt(i);
					//if (Character.isLetter(ch)) 
					if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
						num3Final = i;
						break;
					}
				}
				break;
			}			
		}
		if (num3Final == 0) {
			num3Final = str.length();
		}
		soma = Integer.valueOf(str.substring(num1Inicio, num1Final)) 
				+ Integer.valueOf(str.substring(num2Inicio, num2Final))
				+ Integer.valueOf(str.substring(num3Inicio, num3Final));
		System.out.println(soma);
		for (i = 2; i <= n; i++) {
			str = in.nextLine();
			soma = Integer.valueOf(str.substring(num1Inicio, num1Final)) 
					+ Integer.valueOf(str.substring(num2Inicio, num2Final))
					+ Integer.valueOf(str.substring(num3Inicio, num3Final));
			System.out.println(soma);
		}
		in.close();
	}

}
