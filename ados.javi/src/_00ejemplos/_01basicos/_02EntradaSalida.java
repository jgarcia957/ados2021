package _00ejemplos._01basicos;

import java.util.Locale;
import java.util.Scanner;

public class _02EntradaSalida {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);//.useLocale(Locale.US);
		
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		System.out.println("Estatura: ");
		double estatura = tec.nextDouble(); tec.nextLine();
		
		System.out.println("Nombre de pila: ");
		//String nombre = tec.next();
		String nombre = tec.nextLine();
		
		
		System.out.println("Te llamas " + nombre + " tienes " + edad + " años y mides " + estatura);
		System.out.format("Te llamas %s, tienes %d años y mides %f metros %n", nombre, edad, estatura);
		System.out.format("Te llamas %s, tienes %3d años y mides %5.2f metros %n", nombre, edad, estatura);
		System.out.format("Te llamas %s, tienes %03d años y mides %05.2f metros %n", nombre, edad, estatura);
		
	}
}
