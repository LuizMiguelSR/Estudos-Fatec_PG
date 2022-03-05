package Aula16_Prova02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class P6 {
    public static final String NOME_ARQUIVO = "notas.csv";

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Consulta notas");
            System.out.print("Nome do aluno: ");
            String mostrarmedia = in.next();

            boolean achou = false;
            File f = new File(NOME_ARQUIVO);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            br.readLine(); // cabeçalho
            while (br.ready()) {
                String[] tokens = br.readLine().split(";");
                if (mostrarmedia.equals(tokens[0])) {
                    float media = (Float.parseFloat(tokens[1]) + Float.parseFloat(tokens[2]))/2;    
                    System.out.println("Aluno: " + tokens[0]);
                    System.out.printf("Media:%.2f\n", media);
                    achou = true;
                    break;
                }
            }
            br.close();
            if (!achou) {
                System.out.println("\nAluno nao encontrado!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Entrada invalida! Tente novamente.");
        }
        in.close();
    }
}

