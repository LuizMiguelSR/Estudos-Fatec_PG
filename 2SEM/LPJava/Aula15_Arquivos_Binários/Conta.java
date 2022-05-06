package Aula15_Arquivos_Binários;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Conta implements Serializable {
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
                System.out.println("<3> Mostrar conta");
                System.out.println("<4> Remover conta");
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
                    System.out.print("Detalhes de uma contal\nNumero: ");
                    mostrarConta(in.nextInt());					
                    break;
                case 4:
                    System.out.print("Remover uma contal\nNumero: ");
                    removerConta(in.nextInt());					
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

    private static void listarContas() {
        try {
            ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("contas.dat")));
            System.out.println("-------------------------------------------");
            System.out.println("|Numero     | Titular         | Saldo     |");
            System.out.println("-------------------------------------------");
            while (true) {
                Conta c = (Conta) input.readObject();
                System.out.printf("|%-10d | %-15.15s | %10.2f|\n", c.numero, c.titular, c.saldo);
                System.out.println("-------------------------------------------");
            }
        } catch (EOFException e) {
            System.out.println("Fim dos registros");
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto invalido!");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
    }
    private static void novaConta() {
            Conta c = new Conta();		
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
    private static void mostrarConta(int num) {
            try {
                ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("contas.dat")));
                while (true) {
                    Conta c = (Conta) input.readObject();
                    if(num == c.numero){
                        System.out.println("-------------------------------------------");
                        System.out.println("|Numero     | Titular         | Saldo     |");
                        System.out.println("-------------------------------------------");                                    
                        System.out.printf("|%-10d | %-15.15s | %10.2f|\n", c.numero, c.titular, c.saldo);
                        System.out.println("-------------------------------------------");
                        break;
                    }				
                }
            } catch (EOFException e) {
                System.out.println("Fim dos registros");
            } catch (ClassNotFoundException e) {
                System.out.println("Tipo de objeto invalido!");
            } catch (IOException e) {
                System.out.println("Erro de leitura no arquivo");
            }
    }
    private static void removerConta(int num) {
        try {
            Files.copy(Paths.get("contas.dat"), Paths.get("copia.dat"), StandardCopyOption.REPLACE_EXISTING);
            ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("contas.dat")));
            ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("contas.dat")));
                while (true) {
                    Conta c = (Conta) input.readObject();
                    if(num != c.numero){
                        output.writeObject(c);
                        
                    }				
                }
            /*InputStream fis = Files.newInputStream(Paths.get("contas.dat"));
            ObjectInputStream input = new ObjectInputStream(fis);
            ArrayList<Conta> listaConta = new ArrayList<Conta>();        
            while (fis.available() > 0) {
                Conta c = (Conta) input.readObject();
                if (c.numero == num || c == null) continue;
                listaConta.add(c);
            }        
            Path path = Paths.get("contas.dat");
            ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path));

            for (Conta c : listaConta) {
                output.writeObject(c);
            }       
            output.close();*/ 
        } catch (EOFException e) {
            System.out.println("Fim dos registros");
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto invalido!");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
    }
}
