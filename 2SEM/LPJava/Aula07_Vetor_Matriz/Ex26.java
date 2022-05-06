package Aula07_Vetor_Matriz;

import java.util.Scanner;

/*
 * 26. (1a Fase da Maratona de Programação 2014) Frustrado e desanimado com os resultados de
 * sua equipe de futebol, o Super Brasileiro Clube (SBC) resolveu investir na equipe de
 * handebol. Para melhor avaliar os atletas, os técnicos identificaram que seria útil analisar a
 * regularidade dos jogadores. Especificamente, eles estão interessados em saber quantos
 * jogadores fizeram gols em todas as partidas.
 * Como o volume de dados é muito grande, eles gostariam de ter um programa de
 * computador para realizar essa contagem.
 * Entrada
 * A primeira linha da entrada contém dois inteiros N e M (1 ≤ N ≤ 100 e 1 ≤ M ≤ 100),
 * indicando respectivamente o número de jogadores e o número de partidas. Cada uma das
 * N linhas seguintes descreve o desempenho de um jogador: a i-ésima linha contém M
 * inteiros X j (0 ≤ X j ≤ 100, para 1 ≤ j ≤ M), informando o número de gols do i-ésimo jogador
 * em cada partida.
 * Saída
 * Seu programa deve produzir uma única linha, contendo um único inteiro, o número de
 * jogadores que fizeram gols em todas as partidas.
 */
public class Ex26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int[][] jogos = new int[n][m];
		int i, j, cont = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				jogos[i][j] = in.nextInt();
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < m && jogos[i][j] != 0; j++);
			
			if (j == m) {
				cont++;
			}
		}
		System.out.println(cont);
		in.close();
	}

}
