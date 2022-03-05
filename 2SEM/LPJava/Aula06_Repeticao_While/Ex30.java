package Aula06_Repeticao_While;

import java.util.Scanner;

/*
 * 30. Criar um programa em Java que ajude o DETRAN a saber o total de recursos que foram
 * arrecadados com a aplicação de multas de trânsito. O programa deve ler as seguintes
 * informações para cada motorista:
 * i) O número da carteira de motorista;
 * ii) O número de multas; 
 * iii) O valor de cada uma das multas.
 * Deve ser impresso o valor da dívida para cada motorista e ao final da leitura o total de recursos
 * arrecadados (somatório de todas as multas). O programa deverá imprimir também o número da
 * carteira do motorista que obteve o maior número de multas. O programa termina ao ler a
 * carteira de motorista de valor 0.
 */

public class Ex30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cartMotorista, numMultas, cartMaisMultas, maisMultas = 0;
		float valorMulta, valorMultasMotorista, valorMultasTotal = 0;
		System.out.print("Informe o numero da carteira de motorista (0 p/ encerrar): ");
		cartMaisMultas = cartMotorista = in.nextInt();
		while (cartMotorista != 0) {
			valorMultasMotorista = 0;
			System.out.print("Informe o numero de multas: ");
			numMultas = in.nextInt();
			if (numMultas > maisMultas) {
				maisMultas = numMultas;
				cartMaisMultas = cartMotorista;
			}
			for (int i = 1; i <= numMultas; i++) {
				System.out.printf("Valor da %da. multa: R$ ", i);
				valorMulta = in.nextFloat();
				valorMultasMotorista += valorMulta;
			}
			valorMultasTotal += valorMultasMotorista;
			System.out.printf("Divida do motorista com multas: R$ %.2f\n\n", valorMultasMotorista);
			System.out.print("Informe o numero da carteira de motorista (0 p/ encerrar): ");
			cartMotorista = in.nextInt();			
		}
		System.out.printf("\nValor total arrecadado com multas: R$ %.2f\n", valorMultasTotal);
		System.out.printf("Carteira do motorista com maior numero de multas (%d): %d\n", maisMultas, cartMaisMultas);
		in.close();
	}

}
