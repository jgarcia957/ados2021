package _00ejemplos._03excepciones;

import java.util.Scanner;

public class _09PropagarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Dividendo: ");
		int a = tec.nextInt();
		System.out.println("Divisor: ");
		int b = tec.nextInt();
		
		System.out.println("Cociente: " + dividir(a,b));
		System.out.println("Cociente: " + dividir2(a,b));
	}
	//Este método dividir, captura la excepcion.
	public static int dividir(int x, int y){
		try{
			return x/y;
		} catch (ArithmeticException e){
			return 0;
		}
	}
	//Este otro está propagando la excepción
	public static int dividir2(int x, int y){
			int a = 1/0;
			return x/y;
	
	}

}
