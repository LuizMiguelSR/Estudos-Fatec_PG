package Aula13_TratamentoDeExcecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Lista_Ex04 {

	public static void main(String[] args) {
		cat(new File("C:/Users/Luiz Miguel/Desktop/Calculadora.java"));
	}

	public static void cat(File file) {
		RandomAccessFile input = null;
		String line = null;
		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;		
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado!");
		} catch (IOException e) {
			System.out.println("Nao foi possivel ler do arquivo!");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println("Erro no fechamento do arquivo!");
				}
			}
		}
	}

}
