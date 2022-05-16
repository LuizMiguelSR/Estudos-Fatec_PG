package Aula14_ArquivosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Lista_Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int c = 0;
	int i = 0;
        int y = 1;	
        while(y == 1){
            if(y==1){
		System.out.print("Digite a opcao 1-Listar, 2-Mostrar, 3-Inserir, 4-Remover, 5-Sair: ");
		c = in.nextInt();	
		switch (c){
                    case 1:
			listar();
			break;
                    case 2:
			System.out.print("Digite a ref: ");
			String n = in.next();
			mostrar(n);
			break;
                    case 3:
			inserir();
			break;
                    case 4:
			System.out.print("Digite a ref: ");
			String n1 = in.next();                
			remover(n1);
			break;
                    case 5:
			y = 0;
			System.out.println("Encerrando...");
			break;
		}	
            }
        }
    }
    public static void listar(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/Luiz Miguel/Desktop/imoveis.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] colunas = line.split(";");
                System.out.println(colunas[0]+"\t"+colunas[4]);
            }
	} catch (FileNotFoundException e) {
            System.out.println("Erro arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita");
        }
    }
    public static void mostrar(String n){
        try {
            int i = 0;
            int n1 = Integer.parseInt(n);
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/Luiz Miguel/Desktop/imoveis.csv"));
            while ((line = br.readLine()) != null) {
		String[] colunas = line.split(";");
		if (n1 == i){							
                    System.out.println(colunas[0]+"\t"+colunas[1]+"\t"+colunas[2]+"\t"+colunas[3]+"\t"+colunas[4]);
		}
		i++;
            }
	} catch (FileNotFoundException e) {
            System.out.println("Erro arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita");
        }
    }
    public static void inserir(){
        try {
            Scanner in2 = new Scanner(System.in);
            FileWriter fw = new FileWriter("C:/Users/Luiz Miguel/Desktop/imoveis.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            String str = null;
            System.out.println("Digite o valores separados por ; ");
            while (!(str = in2.nextLine()).isEmpty()) {
		bw.write(str);
		bw.newLine();
            }					
            bw.close();
            fw.close();
	} catch (FileNotFoundException e) {
            System.out.println("Erro arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita");
        }
    }
    public static void remover(String n1){
        try {
            ArrayList<String> guardar = new ArrayList();
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/Luiz Miguel/Desktop/imoveis.csv"));
            String line = "";
            int i = 0;
            int n2 = Integer.parseInt(n1);
            while ((line = br.readLine()) != null) {								
		if (n2 != i){							
                    guardar.add(line);
		}
            i++;
            }
            FileWriter fw1 = new FileWriter("C:/Users/Luiz Miguel/Desktop/imoveis.csv");
            BufferedWriter bw1 = new BufferedWriter(fw1);
            for (int a = 0; a < guardar.size(); a++) {
		bw1.write(guardar.get(a));
		bw1.newLine();
            }					
            bw1.close();
            fw1.close();
	} catch (FileNotFoundException e) {
            System.out.println("Erro arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita");
        }
    }
}
