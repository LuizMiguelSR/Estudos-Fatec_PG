package Trabalho01;
import java.util.Locale;
import java.util.Scanner;
/**
 * Integrantes: Luiz Miguel Santos Rodrigues;
 *              Henrique Fialho Miranda; 
 *              Gustavo Henrique Ceciliano de Andrade.          
 */
public class tp1 {
	public static void main(String[] args) {
		int somd1 = 0, somd2 = 0, maid = 0, mesm = 0;
		float perc1 = 0, perc2 = 0;
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		int Tpop = in.nextInt();
		int mes = in.nextInt();
		int[] d1 = new int[mes], d2 = new int[mes], som = new int[mes];
		for (int i = 0; i < mes; i++) {
			d1[i] = in.nextInt();
			somd1 = somd1 + d1[i];
		}
		for (int j = 0; j < mes; j++) {
			d2[j] = in.nextInt();
			somd2 = somd2 + d2[j];
		}
		in.close();
		perc1 = ((float) somd1 / (float) Tpop) * 100;
		System.out.printf("%.1f\n", perc1);
		perc2 = ((float) somd2 / (float) Tpop) * 100;
		System.out.printf("%.1f\n", perc2);
		for (int i = 0; i < mes; i++) {
			som[i] = d1[i] + d2[i];
			if (i == 0) {
				maid = som[i];
				mesm = i + 1;
			} else if (maid < som[i]) {
				maid = som[i];
				mesm = i + 1;
			}
		}
		System.out.println(mesm);
	}
}
