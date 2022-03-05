package Trabalho02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * Integrantes: Gustavo Henrique Ceciliano de Andrade; 
 *              Henrique Fialho Miranda; 
 *		Luiz Miguel Santos Rodrigues.                      
 */
public class imobiliaria implements Serializable {
	
	/* VARIAVEIS DE AMBIENTE */
    /**/ public static final String NOME_BINARIO = "teste.dat";
    /************************/
    
    public static String separador = ";";
    
    private int referencia;
    private String tipo;
    private int quartos;
    private String bairro;
    private float valor;

    public static void main(String[] args) throws IOException {
    	
	Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        
        int op = 0;
        
        do {
            try {
                System.out.println("\nIMOBILIARIA");
                System.out.println("<1> Importar tabela");
                System.out.println("<2> Exportar tabela");
                System.out.println("<3> Listar imoveis");
                System.out.println("<4> Mostrar detalhe do imovel");
                System.out.println("<5> Inserir novo imovel");
                System.out.println("<6> Remover imovel");
                System.out.println("<0> Sair");
                System.out.print("Opcao: ");
                op = in.nextInt();
                switch (op) {
                case 1:
                    importarTabela();
                    break;
                case 2:
                    exportarTabela();
                    break;
                case 3:
                    listarImoveis();
                    break;                            
                case 4:
                    System.out.print("Detalhes do Imovel\nReferencia: ");
                    mostrarDetalhes(in.nextInt());
                    break;
                case 5:
                    inserirImovel();
                    break; 
                case 6:
                    System.out.print("Remover Imovel\nReferencia: ");
                    removerImovel(in.nextInt());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                }
            } catch (NoSuchElementException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("Tipo de objeto invalido!");
            } catch (EOFException e) {
                System.out.println("\nFim dos registros");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } while (op != 0);
        
        in.close();
    }

    private static void importarTabela() throws IOException, EOFException {
        Scanner in = new Scanner(System.in);
        String NOME_ARQUIVO1 = "";
        System.out.print("Informe o nome de um arquivo ou seu caminho: ");
        Path path = Paths.get(in.nextLine());
        if (Files.exists(path)) {
            System.out.printf("Caminho encontrado: %s\n", path.toAbsolutePath());
            NOME_ARQUIVO1 = String.format("%s",path.toAbsolutePath());
			
			imobiliaria c = new imobiliaria();
			FileReader fr = new FileReader(NOME_ARQUIVO1);
			BufferedReader br = new BufferedReader(fr);
			
			String[] temp = br.readLine().split(separador);
			
			if (temp.length <= 1) {
				separador = ",";
				temp = temp[0].split(separador);
			}
			
			String line = "";
			Path path1 = Paths.get(NOME_BINARIO);
			
			while (br.ready()) {
				
				line = br.readLine();        	
				String[] colunas = line.split(separador);
				c.referencia = Integer.parseInt(colunas[0]);
				c.tipo = colunas[1];
				c.quartos = Integer.parseInt(colunas[2]);
				c.bairro = colunas[3];
				c.valor = Float.parseFloat(colunas[4]);     
				
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
    }

    private static void exportarTabela() throws IOException, ArrayIndexOutOfBoundsException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        String NOME_ARQUIVO2 = "";
        System.out.print("Informe o nome de um arquivo ou seu caminho: ");
        Path path = Paths.get(in.nextLine());
        if (Files.exists(path)) {
            System.out.printf("Caminho encontrado: %s\n", path.toAbsolutePath());
            NOME_ARQUIVO2 = String.format("%s",path.toAbsolutePath());                
			InputStream fis = Files.newInputStream(Paths.get(NOME_BINARIO));
			ObjectInputStream input = new ObjectInputStream(fis);
			FileWriter fw = new FileWriter(NOME_ARQUIVO2);
			BufferedWriter bw = new BufferedWriter(fw);
			imobiliaria c = null;
			
			bw.write("Referencia"+ separador +"Tipo"+ separador +"Quartos"+ separador +"Bairro"+ separador +"Valor\n");
			
			while (fis.available() > 0) {
				c = (imobiliaria) input.readObject();
				if (c == null) continue;
				
				String writeString = String.format("%d" + separador + "%s" + separador + "%d" + separador + "%s" + separador + "%.2f\n", c.referencia, c.tipo,  c.quartos, c.bairro, c.valor);
				bw.write(writeString);
				bw.flush();
			}
			
			bw.close();
			input.close();
        } else {
            System.out.printf("%s nao encontrado tente novamente\n", path);
        }    	       
    }
    
    private static void listarImoveis() throws IOException, ClassNotFoundException, EOFException {
    	InputStream fis = Files.newInputStream(Paths.get(NOME_BINARIO));
        ObjectInputStream input = new ObjectInputStream(fis);
        
        System.out.println("-------------------------");
        System.out.println("|Referencia | Valor     |");
        System.out.println("-------------------------");
        
        while (fis.available() > 0) {
            imobiliaria c = (imobiliaria) input.readObject();
            System.out.printf("|%-10d | %10.2f|\n", c.referencia, c.valor);
            System.out.println("-------------------------");
        }		
        
        input.close();
        fis.close();
    }
    
    private static void mostrarDetalhes(int num) throws IOException, ClassNotFoundException {
    	InputStream fis = Files.newInputStream(Paths.get(NOME_BINARIO));
        ObjectInputStream input = new ObjectInputStream(fis);
        
        while (fis.available() > 0) {
            imobiliaria c = (imobiliaria) input.readObject();
            
            if(num == c.referencia){
                System.out.println("---------------------------------------------------------------------");
                System.out.println("|Referencia | Tipo            | Quartos    | Bairro     | Valor     |");
                System.out.println("---------------------------------------------------------------------");
                System.out.printf("|%-10d | %-15.15s | %-10d | %-10.10s | %10.2f|\n", c.referencia, c.tipo, c.quartos, c.bairro, c.valor);
                System.out.println("---------------------------------------------------------------------");
            }
        }    
        
    }
    
    private static void inserirImovel() throws IOException {
        imobiliaria c = new imobiliaria();		
        Scanner in = new Scanner(System.in);
           
        System.out.print("Referencia: ");
    	c.referencia = in.nextInt();
    	System.out.print("Tipo: ");
    	in.nextLine();
    	c.tipo = in.nextLine();
    	System.out.print("Quartos: ");
    	c.quartos = in.nextInt();
    	System.out.print("Bairro: ");
    	in.nextLine();
    	c.bairro = in.nextLine();        
    	System.out.print("Valor: ");
    	c.valor = in.nextFloat();
        
        Path path = Paths.get(NOME_BINARIO);
        if (Files.exists(path)) {
            FileOutputStream fos = new FileOutputStream(NOME_BINARIO, true);
            AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos);				
            output.writeObject(c);
            output.close();
        } else {
            ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path));
            output.writeObject(c);
            output.close();
        }
    }
    
    private static void removerImovel(int num) throws IOException, ClassNotFoundException, EOFException {
    	InputStream fis = Files.newInputStream(Paths.get(NOME_BINARIO));
    	ObjectInputStream input = new ObjectInputStream(fis);

        ArrayList<imobiliaria> listaImoveis = new ArrayList<imobiliaria>();
        
        while (fis.available() > 0) {
        	imobiliaria imv = (imobiliaria) input.readObject();
        	if (imv.referencia == num || imv == null) continue;
        	listaImoveis.add(imv);
        }
        
        Path path = Paths.get(NOME_BINARIO);
        ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path));
        
        for (imobiliaria imv : listaImoveis) {
        	output.writeObject(imv);
        }
        
        output.close();        
        
    }
}