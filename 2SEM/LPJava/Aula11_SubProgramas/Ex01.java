package Aula11_SubProgramas;

import java.util.Scanner;

class Ex01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Insira um numero inteiro: ");
		int n = in.nextInt();
		if (parOuImpar(n)) {
			System.out.printf("%d e par\n", n);
		}
		else {
			System.out.printf("%d e impar\n", n);
		}
		in.close();
	}

	private static boolean parOuImpar(int n) {
		/*
		boolean b = n % 2 == 0 ? true : false;
		return b;
		*/
		
		//return (n % 2 == 0);
		
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}
}