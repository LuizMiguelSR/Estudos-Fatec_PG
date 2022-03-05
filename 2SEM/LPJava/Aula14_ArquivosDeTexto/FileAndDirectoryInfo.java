package Aula14_ArquivosDeTexto;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Informe o nome de um arquivo ou diretorio: ");
			Path path = Paths.get(in.nextLine());
			if (Files.exists(path)) {
				System.out.printf("\n%s existe\n", path.getFileName());
				System.out.printf("%s um diretorio\n", Files.isDirectory(path) ? "E'" : "Nao e'");
				System.out.printf("%s um caminho absoluto\n", path.isAbsolute() ? "E'" : "Nao e'");
				System.out.printf("Ultima modificacao: %s\n", Files.getLastModifiedTime(path));
				System.out.printf("Tamanho: %s bytes\n", Files.size(path));
				System.out.printf("Caminho: %s\n", path);
				System.out.printf("Caminho absoluto: %s\n", path.toAbsolutePath());
				if (Files.isDirectory(path)) { // listagem de diretório de saída
					System.out.println("\nConteudo do diretorio:");
					// objeto para iteração pelo conteúdo de um diretório
					DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
					for (Path p : directoryStream) {
						System.out.println(p);
					}
				}
			} else {
				System.out.printf("%s nao existe\n", path);
			}
		} catch (InvalidPathException e) {
			System.out.println("Caminho invalido!");
		} catch (SecurityException e) {
			System.out.println("Voce nao tem permissao de realizar essa operacao!");
		} catch (NotDirectoryException e) {
			System.out.println("Nao e' um diretorio!");
		} catch (IOException e) {
			System.out.println("Erro de leitura/escrita!");
		}
		in.close();
	}
}
