package _00ejemplos._03excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03CapturarExcepcion {
	public static void main(String[] args) {
		try {
			Scanner tec = new Scanner(System.in);
			System.out.println("Introduce nombre: ");
			String nombre = tec.next();

			System.out.println("Introduce posición del nombre: ");
			int pos = tec.nextInt();

			System.out.format("En la posicion %d de %s esta el caracter %c", pos, nombre, nombre.charAt(pos - 1));
		} catch (InputMismatchException e) {
			System.out.println("La posicion tiene que ser un numero entero");
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("El nombre no tiene tantos caracteres");
		} catch (RuntimeException e){
			System.out.println("Error de ejecucion inesperado");
		} catch (Exception e){
			System.out.println("Esto si que no me lo esperaba");
		}
		System.out.println("Final controlado del programa");
	}

}
