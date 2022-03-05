package Aula14_ArquivosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 2. Escreva um programa para criptografar e descriptografar um arquivo do tipo texto usando a
 * cifra de César (https://pt.wikipedia.org/wiki/Cifra_de_César). O programa deve receber
 * como argumentos do método da main() o nome do arquivo a ser criptografado ou
 * descriptografado, -c (criptografar) ou -d (descriptografar), a chave (rotação) e o nome do
 * arquivo que será gerado pela criptografia ou descriptografia.
 */
public class Lista_Ex02 {

	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("Uso incorreto!");
			System.exit(1);
		}		
		try {
			FileReader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(args[3]);
			BufferedWriter bw = new BufferedWriter(fw);
			int chave = Integer.parseInt(args[2]);
			if (args[1].equals("-c")) {
				while (br.ready()) {
					int ch = br.read();
					bw.write(ch + chave);
				}
			}
			else if (args[1].equals("-d")){
				while (br.ready()) {
					int ch = br.read();
					bw.write(ch - chave);
				}				
			}
			else {
				throw new IllegalArgumentException("Erro: o segundo argumento deve ser -c ou -d");
			}
			br.close();
			fr.close();
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.printf("Erro: arquivo nao encontrado (%s)", args[0]);
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita!");
		} catch (NumberFormatException e) {
			System.out.println("Erro: a chave de rotacao deve ser um inteiro!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
