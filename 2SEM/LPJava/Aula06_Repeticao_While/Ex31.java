package Aula06_Repeticao_While;

import java.util.Scanner;

/*
 * 31. Foi feita uma pesquisa de audiência de canais de TV em várias casas de certa cidade, em um
 * determinado dia. Para cada casa visitada foram fornecidos o número do canal (4, 5, 7 ou 12) e
 * o número de pessoas que estavam assistindo a ele naquela casa. Se a televisão estivesse
 * desligada, nada seria anotado, ou seja, a casa não entraria na pesquisa. Criar um programa em
 * Java que:
 * - Leia um número indeterminado de dados, isto é, o número do canal e o número de pessoas
 * que estavam assistindo;
 * - Calcule e imprima a porcentagem de audiência de cada canal.
* Para encerrar a entrada de dados, digite o número do canal igual a zero.
 */

public class Ex31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int canal, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0, pessoas, total = 0;
		System.out.println("Pesquisa de audiencia");
		System.out.print("Informe o numero do canal (4, 5, 7 ou 12): ");
		canal = in.nextInt();
		while (canal != 0) {			
			switch (canal) {
			case 4:
				System.out.print("Informe o numero de pessoas assistindo ao canal 4: ");
				pessoas = in.nextInt();
				canal4 += pessoas;
				total += pessoas;
				break;
			case 5:
				System.out.print("Informe o numero de pessoas assistindo ao canal 5: ");
				pessoas = in.nextInt();
				canal5 += pessoas;
				total += pessoas;
				break;
			case 7:
				System.out.print("Informe o numero de pessoas assistindo ao canal 7: ");
				pessoas = in.nextInt();
				canal7 += pessoas;
				total += pessoas;
				break;
			case 12:
				System.out.print("Informe o numero de pessoas assistindo ao canal 12: ");
				pessoas = in.nextInt();
				canal12 += pessoas;
				total += pessoas;
				break;
			default:
				System.out.println("Numero de canal invalido!");
			}
			System.out.print("Informe o numero do canal (4, 5, 7 ou 12): ");
			canal = in.nextInt();
		}
		System.out.printf("\nPercentual de audiencia do canal  4: %5.1f %%\n", canal4 * 100.0 / total);
		System.out.printf("Percentual de audiencia do canal  5: %5.1f %%\n", canal5 * 100.0 / total);
		System.out.printf("Percentual de audiencia do canal  7: %5.1f %%\n", canal7 * 100.0 / total);
		System.out.printf("Percentual de audiencia do canal 12: %5.1f %%\n", canal12 * 100.0 / total);
		in.close();
	}

}
