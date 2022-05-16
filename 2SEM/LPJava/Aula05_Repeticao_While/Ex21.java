package Aula05_Repeticao_While;

/*
 * 21. Escreva um programa em Java para calcular o valor de π, com precisão de 0.0001, usando a
série:

π = 4 − 4/3 + 4/5 − 4/7 + 4/9 − 4/11 + ...

 */
public class Ex21 {

	public static void main(String[] args) {
		boolean soma = true;
		double pi = 0, parc;
		int divisor = 1;
		
		do {
			parc = 4.0 / divisor;
			/*
			if (soma) {
				pi += parc;
			}
			else {
				pi -= parc;
			}
			*/
			pi += (soma ? parc : -parc);
			divisor += 2;	
			soma = !soma;
		} while (parc >= 0.0001);
		System.out.println("PI = " + pi);

	}

}
