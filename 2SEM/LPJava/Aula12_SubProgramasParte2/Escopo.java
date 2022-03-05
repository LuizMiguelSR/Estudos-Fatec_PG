package Aula12_SubProgramasParte2;

public class Escopo {

	public static void main(String[] args) {
		int a = 10;
		metodo1(a);
		int b = a / 2;
		metodo2(b);
		System.out.printf("a = %d\nb = %d\n", a, b);
	}

	public static void metodo1(int x) {
		x /= 2;
		System.out.printf("x = %d\n", x);		
	}

	public static void metodo2(int y) {
		if (y >= 5) {
			int z = y * 10;
			System.out.printf("z = %d\n", z);
		}
		System.out.printf("y = %d\n", y);		
	}	
	
}
