package Aula14_ArquivosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lista_Ex01 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Erro: uso incorreto!");
			System.exit(1);
		}
		File fIn = new File(args[0]);
		if (fIn.exists()) {
			try {
				FileReader fr = new FileReader(fIn);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(args[1]);
				BufferedWriter bw = new BufferedWriter(fw);
				while (br.ready()) {
					String s = br.readLine();
					bw.write(s.toUpperCase());
					bw.newLine();
				}
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("Erro de leitura/escrita!");
				e.printStackTrace();
			}
		} else {
			System.out.println("Erro: arquivo nao encontrado (" + args[0] + ")");
		}
	}

}
