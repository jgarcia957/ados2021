package _00ejemplos._03excepciones;

import java.util.Scanner;

public class _01SituacionesInesperadas {
	public static void main(String[] args) {
		//Algunos ejemplos de situaciones en que se produce
		//un error de ejecución
		
		Scanner tec = new Scanner(System.in);
		
		//Si leemos un int y el usuario introduce otro tipo
		//de información
		System.out.println("Edad: "); 
		int edad = tec.nextInt(); //InputMismatchException
		
		//Si dividimos un entero por cero
		System.out.println("Dividendo: ");
		int dividendo = tec.nextInt();
		System.out.println("Divisor");
		int divisor = tec.nextInt();
		System.out.println("Cociente: " + (dividendo / divisor)); //ArithmeticException si el divisor es 0
		
		//Si intento acceder a una posicion incorrecta de un array o de un String
		System.out.println("Nombre: ");
		String nombre = tec.next();
		//Mostrar el quinto caracter del nombre
		System.out.println(nombre.charAt(4)); //StringIndexOutOfBounds si el nombre tiene menos de 5 caracteres
		
		
	}

}
