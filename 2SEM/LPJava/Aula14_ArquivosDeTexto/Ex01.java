package Aula14_ArquivosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Uso incorreto!");
			System.exit(1);
		}
		Scanner in = new Scanner(System.in);
		try {
            File arquivo = new File(args[0]);
			FileWriter fw = new FileWriter(args[0], true);
			BufferedWriter bw = new BufferedWriter(fw);
			String str = null;
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
            System.out.println("Leitura");
			while (br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
			}
            System.out.println("Escreva abaixo");
			while (!(str = in.nextLine()).isEmpty()) {
				bw.write(str);
				bw.newLine();
			}
			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita");
		} 
		in.close();
    }
    
}
