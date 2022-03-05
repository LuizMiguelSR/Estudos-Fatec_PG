package Aula09_Strings;

import java.util.Scanner;

public class Lista_Ex06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, k, j;
		n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			k = in.nextInt();
			String[] idiomas = new String[k];
			in.nextLine();
			for (j = 0; j < k; j++) {
				idiomas[j] = in.nextLine();
			}
			String idioma1 = idiomas[0];
			for (j = 1; j < k; j++) {
				if (!idioma1.equals(idiomas[j])) {
					break;
				}
			}
			if (j < k) {
				System.out.println("ingles");
			}
			else {
				System.out.println(idioma1);
			}
		}
		in.close();
	}

}
