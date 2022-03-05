package Aula16_Prova02;

public class P4 {

    public static void main(String[] args) {
        try{
        System.out.println(dividir(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        } catch (ArithmeticException e) {
            System.out.println("Divisao por zero");
        } catch (IllegalArgumentException e){
            System.out.println("Valores negativos");
        }   
    }
    public static int dividir(int a, int b) throws IllegalArgumentException, ArithmeticException {
        if (a < 0 || b < 0) {                
        }
        if (b == 0) {             
        }
        return a / b;
    }
    
}
