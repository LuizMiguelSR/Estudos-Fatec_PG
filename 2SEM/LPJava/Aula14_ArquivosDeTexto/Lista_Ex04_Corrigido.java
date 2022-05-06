package Aula14_ArquivosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lista_Ex04_Corrigido {
	public static final String NOME_ARQUIVO = "C:/Users/Luiz Miguel/Desktop/" + "/imoveis.csv";

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		int op = 0;
		do {
			try {
				System.out.println("\n\nImobiliaria");
				System.out.println("<1> Listar imoveis");
				System.out.println("<2> Mostrar detalhe do imovel");
				System.out.println("<3> Inserir novo imovel");
				System.out.println("<4> Remover imovel");
				System.out.println("<5> Sair");
				System.out.print("Opcao: ");
				switch (op = in.nextInt()) {
				case 1:
					listarImoveis();
					break;
				case 2:
					System.out.print("Detalhes do Imovel\nReferencia: ");
					mostrarDetalhes(in.next());
					break;
				case 3:
					inserirImovel();
					break;
				case 4:
					System.out.print("Remover Imovel\nReferencia: ");
					removerImovel(in.next());
					break;
				case 5:
					break;
				default:
					System.out.println("Opcao invalida!");
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println("Entrada invalida! Tente novamente.");
				in.nextLine();
			}
		} while (op != 5);
		in.close();
	}

	private static void removerImovel(String ref) throws IOException {
		Files.copy(Paths.get(NOME_ARQUIVO), Paths.get("copia.csv"), StandardCopyOption.REPLACE_EXISTING);
		File f = new File("copia.csv");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(NOME_ARQUIVO);
		BufferedWriter bw = new BufferedWriter(fw);
		boolean achou = false;
		while (br.ready()) {
			String[] tokens = br.readLine().split(";");
			if (!ref.equals(tokens[0])) {
				bw.write(String.format("%s;%s;%s;%s;%s\n", tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]));
			}
			else {
				achou = true;
			}
		}
		if (!achou) {
			System.out.println("\nImovel nao encontrado!");
		}
		br.close();
		fr.close();
		bw.close();
		br.close();		
	}

	private static void inserirImovel() throws IOException {
		FileWriter fw = new FileWriter(NOME_ARQUIVO, true);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner in = new Scanner(System.in);
		System.out.print("Referencia: ");
		int ref = in.nextInt();
		System.out.print("Tipo: ");
		in.nextLine();
		String tipo = in.nextLine();
		System.out.print("Quartos: ");
		int quartos = in.nextInt();
		System.out.print("Bairro: ");
		in.nextLine();
		String bairro = in.nextLine();
		System.out.print("Valor: R$ ");
		float valor = in.nextFloat();
		bw.write(String.format("%d;%s;%d;%s;%.2f\n", ref, tipo, quartos, bairro, valor));
		bw.close();
		fw.close();
	}

	private static void mostrarDetalhes(String ref) throws IOException {
		boolean achou = false;
		File f = new File(NOME_ARQUIVO);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		br.readLine(); // cabeçalho
		while (br.ready()) {
			String[] tokens = br.readLine().split(";");
			if (ref.equals(tokens[0])) {
				System.out.println("Tipo: " + tokens[1]);
				System.out.println("Quartos: " + tokens[2]);
				System.out.println("Bairros: " + tokens[3]);
				System.out.printf("Valor: R$ %.2f\n", Float.parseFloat(tokens[4]));
				achou = true;
				break;
			}
		}
		if (!achou) {
			System.out.println("\nImovel nao encontrado!");
		}
		br.close();
		fr.close();
	}

	private static void listarImoveis() throws IOException {
		File f = new File(NOME_ARQUIVO);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		br.readLine(); // cabeçalho
		System.out.println("|Referencia|Valor     |");
		while (br.ready()) {
			String[] tokens = br.readLine().split(";");
			System.out.printf("|%-10s|%10.2f|\n", tokens[0], Float.parseFloat(tokens[4]));
		}
		br.close();
		fr.close();
	}

}
