package Aula07_Vetor_Matriz;

/*
 * 12. URI 1245 – Botas Perdidas
 */

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, pares;
		char l;
		while (in.hasNext()) {
			// do número 30 ao 60 há 31 valores
			int[] peEsquerdo = new int[31], peDireito = new int[31];
			n = in.nextInt();
			in.nextLine();
			for (int i = 1; i <= n; i++) {
				m = in.nextInt();
				l = in.next().charAt(0);
				if (l == 'E') {
					peEsquerdo[m - 30]++;
				}
				else {
					peDireito[m - 30]++;
				}
			}
			pares = 0;
			for (int i = 0; i < 31; i++) {
				pares += (peEsquerdo[i] < peDireito[i] ? peEsquerdo[i] : peDireito[i]);
			}
			System.out.println(pares);
		}
		in.close();
	}

}
