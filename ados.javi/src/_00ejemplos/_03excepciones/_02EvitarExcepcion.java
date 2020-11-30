package _00ejemplos._03excepciones;

import java.util.Scanner;

public class _02EvitarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Dividendo: ");
		int dividendo = tec.nextInt();
		System.out.println("Divisor");
		int divisor = tec.nextInt();
		//Evitamos hacer una división por cero
		if (divisor != 0)
			System.out.println("Cociente: " + (dividendo / divisor)); 
		else
			System.out.println("No se puede dividir por 0");
	}

}
