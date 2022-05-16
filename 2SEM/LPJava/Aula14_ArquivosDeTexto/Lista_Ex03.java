package Aula14_ArquivosDeTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lista_Ex03 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso incorreto!");
			System.exit(1);
		}
		try {
			FileReader fr = new FileReader(args[1]);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String linha = br.readLine();
				if (linha.indexOf(args[0]) != -1) {
					System.out.println(linha);
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.printf("Erro: arquivo nao encotrado!\n");
		} catch (IOException e) {
			System.out.println("Erro de leitura!");
		}
	}

}
