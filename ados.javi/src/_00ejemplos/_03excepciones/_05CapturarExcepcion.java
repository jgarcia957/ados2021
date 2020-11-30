package _00ejemplos._03excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05CapturarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		try {
			System.out.println("Dividendo: ");
			int dividendo = tec.nextInt();
			try {
				System.out.println("Divisor");
				int divisor = tec.nextInt();
				
				// Ponemos en el try{} las instrucciones que no tiene que ejecutar
				// si algo va mal
				if (divisor != 0) System.out.println("Cociente: " + (dividendo / divisor));
				else System.out.println("No se puede dividir por 0");
				
			} catch (InputMismatchException e) {
				System.out.println("Divisor tiene que ser un entero");
			}
		} catch (InputMismatchException e) {
			System.out.println("Dividendo tiene que ser un entero");
		}

	}

}
