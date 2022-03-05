package Aula15_Arquivos_Binários;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Conta_Corrigido implements Serializable {
	private int numero;
	private String titular;
	private float saldo;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = 0;
		do {
			try {
				System.out.println("Conta Bancaria");
				System.out.println("<1> Nova conta");
				System.out.println("<2> Listar contas");
				System.out.println("<3> Consultar conta");
				System.out.println("<4> Excluir conta");
				System.out.println("<0> Sair");
				System.out.print("Opcao: ");
				op = in.nextInt();
				switch (op) {
				case 1:
					novaConta();
					break;
				case 2:
					listarContas();
					break;
				case 3:
					System.out.print("\nConsultar conta\nNumero da conta: ");					
					consultarConta(in.nextInt());
					break;
				case 4:
					System.out.print("\nExcluir conta\nNumero da conta: ");					
					excluirConta(in.nextInt());
					break;
				case 0:
					break;
				default:
					System.out.println("Opcao invalida!");
				}
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		} while (op != 0);
		in.close();
	}

	private static void excluirConta(int numero) {
		boolean achei = false;
		ObjectInputStream input = null;
		ObjectOutputStream output = null;
		try {			
			Files.copy(Paths.get("contas.dat"), Paths.get("contas.bak"), StandardCopyOption.REPLACE_EXISTING);
			input = new ObjectInputStream(Files.newInputStream(Paths.get("contas.bak")));
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("contas.dat")));
			while (true) {
				Conta_Corrigido c = (Conta_Corrigido) input.readObject();
				if (c.numero != numero) {
					output.writeObject(c);
				}
				else {
					achei = true;
				}
			}
		} catch (EOFException e) {
			if (achei) {
				System.out.println("Conta excluida com sucesso");
			}
			else {
				System.out.println("Erro: conta nao encontrada!");
			}
		} catch (IOException e) {
			System.out.println("Erro ao fazer a copia do arquivo!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro de leitura!");
		} finally {
			try {
				if (input != null) {
					input.close();
				}
				if (output != null) {
					output.close();
				}
			} catch (IOException e) {
				System.out.println("Erro ao fechar os arquivos!");
			}
		}

		
	}

	private static void consultarConta(int numero) {
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("contas.dat")));
			while (true) {
				Conta_Corrigido c = (Conta_Corrigido) input.readObject();
				if (c.numero == numero) {
					System.out.printf("Numero da conta: %d\nTitular: %s\nSaldo: R$ %10.2f\n", c.numero, c.titular, c.saldo);
					return;
				}
			}
		} catch (EOFException e) {
			System.out.println("Erro: conta nao encontrada!");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		} finally {
			if (input != null) {
				try {
                                    input.close();
				} catch (IOException e) {
                                    System.out.println("Erro ao fechar o arquivo!");
				}
			}
		}
	}

	private static void listarContas() {
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("contas.dat")));
			while (true) {
				Conta_Corrigido c = (Conta_Corrigido) input.readObject();
				System.out.printf("%d - %-20.20s %10.2f\n", c.numero, c.titular, c.saldo);
			}				
		} catch (EOFException e) {
			System.out.println("Fim dos registros");
		} catch (ClassNotFoundException e) {
			System.out.println("Tipo de objeto invalido!");
		} catch (IOException e) {
			System.out.println("Erro de leitura no arquivo");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println("Erro ao fechar o arquivo!");
				}
			}
		}
	}

	private static void novaConta() {
		Conta_Corrigido c = new Conta_Corrigido();		
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Numero: ");
			c.numero = in.nextInt();
			System.out.print("Titular: ");
			in.nextLine();
			c.titular = in.nextLine();
			System.out.print("Saldo: R$ ");
			c.saldo = in.nextFloat();			
			Path path = Paths.get("contas.dat");
			if (Files.exists(path)) {
				FileOutputStream fos = new FileOutputStream("contas.dat", true);
				AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos);				
				output.writeObject(c);
				output.close();
			}
			else {
				ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path));
				output.writeObject(c);
				output.close();
			}			
		} catch (IOException e) {
			System.out.println("Erro de escrita no arquivo!");
		}
	}

}
