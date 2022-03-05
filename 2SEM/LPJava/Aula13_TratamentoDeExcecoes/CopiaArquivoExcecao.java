package Aula13_TratamentoDeExcecoes;

import java.io.*;
public class CopiaArquivoExcecao {
 
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("Uso: java CopiaArquivoExcecao <arq1> <arq2>");
            return;
        }

        File arqEntrada = new File(args[0]);
        File arqSaida = new File(args[1]);
        FileReader leitor = null;
        FileWriter escritor = null;

        try {
            leitor = new FileReader(arqEntrada);
            escritor = new FileWriter(arqSaida);        
            int c;
 
            while ((c = leitor.read()) != -1)
                escritor.write(c);

        } catch (FileNotFoundException e) {
            System.out.println("Diretório ou arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita");            
        } finally {
            if (leitor != null) leitor.close();
            if (escritor != null) escritor.close();
        }
 
    }
 
}