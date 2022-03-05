package Aula16_Prova02;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class P5 implements Serializable {
	private String nome;
	private float p1;
	private float p2;
        private float media;
        //public static final String NOME_ARQUIVO = "C:/Users/Luiz Miguel/Desktop/notas.csv";
        public static final String NOME_BINARIO = "media.dat";

	public static void main(String[] args) {
            try {
                Scanner in = new Scanner(System.in);
                Scanner in1 = new Scanner(System.in);
                
                System.out.println("Consultar média");
                               
                String NOME_ARQUIVO1 = "";
                System.out.print("Informe o nome de um arquivo ou seu caminho: ");
                Path path = Paths.get(in1.nextLine());
                
                if (Files.exists(path)) {
                    System.out.printf("Caminho encontrado: %s\n", path.toAbsolutePath());
                    NOME_ARQUIVO1 = String.format("%s",path.toAbsolutePath());

                        P5 c = new P5();
                        FileReader fr = new FileReader(NOME_ARQUIVO1);
                        BufferedReader br = new BufferedReader(fr);
                        String line = "";
                        Path path1 = Paths.get(NOME_BINARIO);

                        while (br.ready()) {
                            String[] colunas = line.split(";");
                            line = br.readLine();        	
                            c.nome = colunas[0];
                            c.p1 = Float.parseFloat(colunas[1]);
                            c.p2 = Float.parseFloat(colunas[1]);     

                            if (Files.exists(path1)) {
                                FileOutputStream fos = new FileOutputStream(NOME_BINARIO, true);
                                AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos);	
                                output.writeObject(c);
                                output.close();
                            } else {
                                ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path1));
                                output.writeObject(c);
                                output.close();
                            }
                        }
                        br.close();
                } else {
                    System.out.printf("%s nao encontrado tente novamente\n", path);
                }
                in1.close();
                System.out.print("Digite o nome do aluno que deseja consultar a média: ");					
                String consulta = in.next();                
                ObjectInputStream input = null;
                input = new ObjectInputStream(Files.newInputStream(Paths.get("media.dat")));
                in.close();
                while (true) {
                    P5 c = (P5) input.readObject();
                    if (c.nome.equals(consulta)) {
                        c.media = (c.p1 + c.p2) / 2;
                        System.out.printf("Nome do aluno: %s\nMedia: %2.2f\n", c.nome, c.media);
                    }
                }                                
            } catch (EOFException e) {
                System.out.println("Erro: conta nao encontrada!");
            } catch (ClassNotFoundException e) {
                System.out.println("Tipo de objeto invalido!");
            } catch (IOException e) {
                System.out.println("Erro de leitura no arquivo");
            }
        }
}
